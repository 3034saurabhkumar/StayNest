package com.saurabh.staynest.service;

import com.saurabh.staynest.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
