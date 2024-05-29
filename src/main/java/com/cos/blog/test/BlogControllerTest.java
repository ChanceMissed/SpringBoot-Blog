package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 스프링이 com.cos.blog 에 있는 어노테이션 을 컴포넌트 스캔해서 스프링 컨테이너에서 관리
public class BlogControllerTest {
    @GetMapping("/test/hello")
    public String hello(){
        return "<h1>hello Spring </h1>";
    }
}
