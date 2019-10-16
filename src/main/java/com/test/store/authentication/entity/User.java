package com.test.store.authentication.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class User {
  @Id
  private String id;
  private String name;
  private String username;
  @JsonProperty(access = Access.WRITE_ONLY)
  private String password;
  private List<String> roles;


  public User(String name, String username, String password, List<String> roles) {
    this.name = name;
    this.username = username;
    this.password = password;
    this.roles = roles;
  }

}