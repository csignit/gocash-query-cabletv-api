package com.gocashapp.cabletv.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CableTv {
    private SubscriptionType subscriptionType;
    private String requestId;
    private Integer SmartCardNumber;
    private TransactionStatus transactionStatus;

}
