package com.saurabh.staynest.repository;

import com.saurabh.staynest.entity.Guest;
import com.saurabh.staynest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}