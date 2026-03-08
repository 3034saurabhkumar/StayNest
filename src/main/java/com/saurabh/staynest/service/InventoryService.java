package com.saurabh.staynest.service;

import com.saurabh.staynest.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}
