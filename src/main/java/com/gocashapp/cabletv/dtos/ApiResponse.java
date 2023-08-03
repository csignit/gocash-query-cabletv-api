package com.gocashapp.cabletv.dtos;

import com.gocashapp.cabletv.entities.TransactionContent;
import com.gocashapp.cabletv.entities.TransactionDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ApiResponse {
//    private SubscriptionType subscriptionType;
//    private Integer SmartCardNumber;
//    private String requestId;
//    private TransactionContent transactionContent;

    private String code;
    private TransactionContent transactionContent;
    private String requestId;
    private Double amount;
    private TransactionDate transaction_date;
    private String purchased_code;
}
