package com.gocashapp.cabletv.entities;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TransactionContent {

//    private Integer unitPrice;
//    private Integer quantity;
//    private Integer commission;
//    private double totalAmount;
//    private String type; // TV Subscription
//    private String email;
//    private String phone;
//    private double convenienceFee;
//    private double amount; //
//    private String platform; // API
//    private String method; // API
//    private long transactionId; // 1586355735881
//    private LocalDateTime transactionDate; // "2020-04-08 15:22:15.000000" (Formatted as a String)

    private Transactions transactions;
    private String response_description;


}
