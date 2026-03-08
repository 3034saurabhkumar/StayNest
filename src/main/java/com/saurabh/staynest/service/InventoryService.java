package com.saurabh.staynest.service;

import com.saurabh.staynest.dto.HotelDto;
import com.saurabh.staynest.dto.HotelSearchRequest;
import com.saurabh.staynest.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
