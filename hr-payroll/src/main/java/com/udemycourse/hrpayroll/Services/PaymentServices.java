package com.udemycourse.hrpayroll.Services;

import com.udemycourse.hrpayroll.Entities.Payment;
import com.udemycourse.hrpayroll.Entities.Worker;
import com.udemycourse.hrpayroll.Feignclient.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServices {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
