package com.gocashapp.cabletv.dtos;

import com.gocashapp.cabletv.entities.TransactionContent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ShowmaxTransactionStatusResponse {
    private String response_description;
    private String code;
    private TransactionContent transactionContent;
    private String requestId;
    private Double amount;
    private String purchased_code;
    private String Voucher;
}
