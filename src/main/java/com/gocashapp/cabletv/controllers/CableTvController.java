package com.gocashapp.cabletv.controllers;

import com.gocashapp.cabletv.dtos.ShowmaxTransactionStatusResponse;
import com.gocashapp.cabletv.dtos.TransactionStatusRequest;
import com.gocashapp.cabletv.dtos.TransactionStatusResponse;
import com.gocashapp.cabletv.services.CableTvService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CableTvController {

    private final CableTvService cableTvService;

    @PostMapping("/dstv")
    public ResponseEntity<TransactionStatusResponse> queryDstvStatus(@RequestBody TransactionStatusRequest transactionStatusRequest) {
        TransactionStatusResponse transactionStatusResponse = cableTvService.queryStatus(transactionStatusRequest);
        return ResponseEntity.ok(transactionStatusResponse);
    }

    @PostMapping("/gotv")
    public ResponseEntity<TransactionStatusResponse> queryGotvStatus(@RequestBody TransactionStatusRequest transactionStatusRequest) {
        TransactionStatusResponse transactionStatusResponse = cableTvService.queryStatus(transactionStatusRequest);
        return ResponseEntity.ok(transactionStatusResponse);
    }

    @PostMapping("/startimes")
    public ResponseEntity<TransactionStatusResponse> queryStartimesStatus(@RequestBody TransactionStatusRequest transactionStatusRequest) {
        TransactionStatusResponse transactionStatusResponse = cableTvService.queryStatus(transactionStatusRequest);
        return ResponseEntity.ok(transactionStatusResponse);
    }

    @PostMapping("/showmax")
    public ResponseEntity<ShowmaxTransactionStatusResponse> queryShowmaxStatus(@RequestBody TransactionStatusRequest transactionStatusRequest) {
        ShowmaxTransactionStatusResponse showmaxTransactionStatusResponse = cableTvService.getQueryStatus(transactionStatusRequest);
        return ResponseEntity.ok(showmaxTransactionStatusResponse);
    }

}
