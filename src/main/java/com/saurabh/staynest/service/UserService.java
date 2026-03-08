package com.saurabh.staynest.service;

import com.saurabh.staynest.dto.ProfileUpdateRequestDto;
import com.saurabh.staynest.dto.UserDto;
import com.saurabh.staynest.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
