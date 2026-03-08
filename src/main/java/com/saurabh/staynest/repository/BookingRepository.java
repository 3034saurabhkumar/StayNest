package com.saurabh.staynest.repository;

import com.saurabh.staynest.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
