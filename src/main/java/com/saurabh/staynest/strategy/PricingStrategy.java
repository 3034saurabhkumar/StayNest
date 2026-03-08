package com.saurabh.staynest.strategy;

import com.saurabh.staynest.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
