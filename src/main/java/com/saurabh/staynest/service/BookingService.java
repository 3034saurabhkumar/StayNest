package com.saurabh.staynest.service;

import com.saurabh.staynest.dto.BookingDto;
import com.saurabh.staynest.dto.BookingRequest;
import com.saurabh.staynest.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
