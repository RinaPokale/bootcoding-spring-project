package com.coupon.application.helper;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CouponHelper {
    public String newCoupon(){
        //UUID:- Universally Unique Identifier
        return UUID.randomUUID().toString();
    }
}
