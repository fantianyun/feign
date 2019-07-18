package com.fty.feign.feign.service;

import com.fty.feign.feign.pojo.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient("hello-service")
public interface HelloService {
    @RequestMapping("/hello-consumer")
    String hello();

    @RequestMapping(value = "hello1")
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "hello2")
    String hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age);

    @RequestMapping(value = "hello3",method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
