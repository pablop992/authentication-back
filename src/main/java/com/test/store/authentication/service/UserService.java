package com.test.store.authentication.service;

import com.test.store.authentication.dto.UserCreationRequest;
import com.test.store.authentication.entity.User;
import com.test.store.authentication.repository.UserRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  private final PasswordEncoder passwordEncoder;

  public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
  }

  public User saveUser(UserCreationRequest request) {

    User user = new User();

    user.setName(request.getName());
    user.setUsername(request.getUser());
    user.setRoles(Arrays.asList("USER"));
    user.setPassword(this.passwordEncoder.encode(request.getPassword()));
    return this.userRepository.save(user);
  }

  public List<User> getAll() {
    return this.userRepository.findAll();
  }

}