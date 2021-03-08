package com.udemycourse.hrpayroll.Services;

import com.udemycourse.hrpayroll.Entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentServices {

    public Payment getPayment(Long WorkerId, int days){
        return new Payment("Bob", 200.0, days);
    }
}
