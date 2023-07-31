package com.gocashapp.cabletv.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CableTv {
    private SubscriptionType subscriptionType;
    private String request_id;
    private Integer SmartCardNumber;
    private TransactionStatus transactionStatus;

}
