package com.mondeshko.souvenir.user.service;


import com.mondeshko.souvenir.user.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

  List<User> getAllUsers();

  User findUserByEmail(String email);
}
