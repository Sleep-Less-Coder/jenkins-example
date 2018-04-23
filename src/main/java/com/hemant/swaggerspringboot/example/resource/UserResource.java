package com.hemant.swaggerspringboot.example.resource;

import com.hemant.swaggerspringboot.example.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Api(value = "User resource representing all users.", description = "REST endpoint for interacting with the Users.")
@RequestMapping("/rest/users")
public class UserResource {

    @GetMapping
    @ApiOperation(value = "Finds all the users in the system.")
    public List<User> findAllUsers() {
        return Arrays.asList(
                new User("Travis", 80000L),
                new User("Scott", 90000L),
                new User("Matthew", 120000L)
        );
    }
}
