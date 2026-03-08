package com.saurabh.staynest.repository;

import com.saurabh.staynest.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
