package com.hemant.swaggerspringboot.example.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "Hello Resource", description = "This is a hello world resource.")
public class HelloResource {

    @GetMapping
    @ApiOperation(value = "Returns a 'Hello World' text.")
    @ApiResponses(value = {
            @ApiResponse(code = 100, message = "Desc. of 100 response code."),
            @ApiResponse(code = 101, message = "What is the meaning of this error code goes here.")
    })
    public String getHello() {
        return "Hello World!";
    }

    @PostMapping
    @ApiOperation(value = "Returns whatever is passed in.")
    public String postHello(@RequestBody String hello) {
        return hello;
    }

    @PutMapping
    @ApiOperation(value = "Returns whatever is passed in.")
    public String putHello(@RequestBody String hello) {
        return hello;
    }

    @DeleteMapping
    @ApiOperation(value = "Returns empty string. DELETE HTTP Method.")
    public String deleteHello() {
        return "";
    }
}
