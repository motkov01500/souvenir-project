package com.mondeshko.souvenir.user.service;

import com.mondeshko.souvenir.user.boundary.repository.UserRepository;
import com.mondeshko.souvenir.user.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

  private UserRepository userRepository;

  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public User findUserByEmail(String email) {
    Optional<User> foundUserByEmail = userRepository.findByEmail(email);

    if(foundUserByEmail.isEmpty()) {
      throw new RuntimeException("Missing user with this email.");
    }

    return foundUserByEmail.get();
  }
}
