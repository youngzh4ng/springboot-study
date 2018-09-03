package com.test.springboot.misc;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class OutPutCaptureUnitTest {

    @Rule
    public OutputCapture capture = new OutputCapture();

    @Test
    public void test_should_get_sout_result() {
        System.out.println("test two test");
        assertThat(capture.toString()).contains("two");
    }

    @Test
    public void test_should_get_serr_result() {
        System.err.println("test three test");
        assertThat(capture.toString()).contains("three");
    }

}
