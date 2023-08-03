package com.gocashapp.cabletv.services;

import com.gocashapp.cabletv.dtos.ShowmaxTransactionStatusResponse;
import com.gocashapp.cabletv.dtos.TransactionStatusRequest;
import com.gocashapp.cabletv.dtos.ApiResponse;

public interface CableTvService {
    ApiResponse queryStatus(TransactionStatusRequest transactionStatusRequest);

    ShowmaxTransactionStatusResponse getQueryStatus(TransactionStatusRequest transactionStatusRequest);
}
