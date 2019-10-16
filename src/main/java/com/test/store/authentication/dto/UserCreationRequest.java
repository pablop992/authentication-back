package com.test.store.authentication.dto;

import lombok.Data;

@Data
public class UserCreationRequest {

  private String name;
  private String user;
  private CharSequence password;

}
