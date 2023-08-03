package com.gocashapp.cabletv.services;

import com.gocashapp.cabletv.dtos.ShowmaxTransactionStatusResponse;
import com.gocashapp.cabletv.dtos.TransactionStatusRequest;
import com.gocashapp.cabletv.dtos.TransactionStatusResponse;

import java.util.List;

public interface CableTvService {
    TransactionStatusResponse queryStatus(TransactionStatusRequest transactionStatusRequest);

    ShowmaxTransactionStatusResponse getQueryStatus(TransactionStatusRequest transactionStatusRequest);
}
