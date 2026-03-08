package com.saurabh.staynest.repository;

import com.saurabh.staynest.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}