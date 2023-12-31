package com.coupon.application.controller;

import com.coupon.application.Coupon;
import com.coupon.application.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/coupon/")
public class CouponController {

    @Autowired
    private CouponService couponService;
        // HTTP Methods Get
        @GetMapping("getCoupon")
        public String newCoupon(){
            return "New Coupon : " + couponService.getNewCoupon();
        }

        @GetMapping("getJson")
        public Coupon getDummyJson(){
            return Coupon.builder()
                    .id(couponService.getNewCoupon())
                    .type("Voucher")
                    .validFor(3).build();
        }

        @GetMapping("getMultipleCoupons")
        public List<String> newCouponWithQuantity(){
            int quantity = 10;
            return couponService.getNewCoupon(quantity);
        }
        // http://localhost:8082/app-name/coupon/getCoupon
}
