package com.saurabh.staynest.dto;

import com.saurabh.staynest.entity.User;
import com.saurabh.staynest.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
