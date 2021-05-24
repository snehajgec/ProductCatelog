package com.product.shopinsta.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api( tags = "Hello")
public class HelloController {

    @ApiOperation(value = "This method is used to get the clients", authorizations = { @Authorization(value="jwtToken") })
    @GetMapping("/hello")
    public String sayHello() {
        return "Swagger Hello World";
    }
}
