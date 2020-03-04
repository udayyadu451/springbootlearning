package com.remington.springbootdemo.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="Test API")
public class TestController {

    @GetMapping("test")
    @ApiOperation(value="test operation")
    public String test(){

        return "test";
    }
}
