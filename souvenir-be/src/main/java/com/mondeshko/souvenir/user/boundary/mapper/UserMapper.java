package com.mondeshko.souvenir.user.boundary.mapper;

import com.mondeshko.souvenir.user.boundary.dto.UserDto;
import com.mondeshko.souvenir.user.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

  UserDto mapUserToUserDto(User user);
}
