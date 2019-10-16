package com.test.store.authentication.controller;

import com.test.store.authentication.dto.UserCreationRequest;
import com.test.store.authentication.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public void saveUser(@RequestBody UserCreationRequest request) {
    userService.saveUser(request);
  }

}
