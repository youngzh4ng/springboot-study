package com.test.springboot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.springboot.base.MVCTestBase;
import com.test.springboot.domain.User;
import com.test.springboot.jpa.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.restdocs.payload.JsonFieldType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessRequest;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = UserController.class)
public class UserControllerMVCTest extends MVCTestBase {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepository userRepository;

    private User user;

    private ObjectMapper objectMapper;

    @Before
    public void setup() {
        user = new User();
        user.setId(1L);
        user.setPhone("123456");
        user.setUsername("username");
        user.setAge(12);
        user.setEmail("test@oocl.com");
        user.setBirthday(new Date());
        objectMapper = new ObjectMapper();
    }

    @Test
    public void test_getUserByIdAndName() throws Exception {
        when(userRepository.findByUsernameIgnoreCaseAndId(anyString(), any(Long.class))).thenReturn(user);
        this.mockMvc.perform(get("/users/1/young"))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(user)))
                .andDo(document("1.1 Test",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        pathParameters(
                                parameterWithName("id").description("User Id"),
                                parameterWithName("username").description("Username")
                        ),
                        responseFields(
                                fieldWithPath("id").description("User Id").type(JsonFieldType.NUMBER),
                                fieldWithPath("username").description("Username").type(JsonFieldType.STRING),
                                fieldWithPath("phone").description("Phone").type(JsonFieldType.STRING),
                                fieldWithPath("email").description("Email").type(JsonFieldType.STRING),
                                fieldWithPath("age").description("Age").type(JsonFieldType.NUMBER),
                                fieldWithPath("birthday").description("Birthday").type(JsonFieldType.OBJECT)
                        )
                ));
    }

}
