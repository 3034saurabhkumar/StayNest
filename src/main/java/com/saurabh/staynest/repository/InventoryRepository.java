package com.saurabh.staynest.repository;

import com.saurabh.staynest.entity.Inventory;
import com.saurabh.staynest.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByDateAfterAndRoom(LocalDate date, Room room);
}
