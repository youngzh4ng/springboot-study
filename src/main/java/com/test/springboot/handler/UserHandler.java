package com.test.springboot.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Component
public class UserHandler {

    public Mono<ServerResponse> getUser(ServerRequest req) {
        Optional<Object> user = req.attribute("user");
        String userStr = (String) user.orElse("");
        System.out.println("get User "  + userStr);
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromObject("Hello, " + userStr));
    }

}
