package com.gocashapp.cabletv.controllers;

import com.gocashapp.cabletv.dtos.ShowmaxTransactionStatusResponse;
import com.gocashapp.cabletv.dtos.TransactionStatusRequest;
import com.gocashapp.cabletv.dtos.ApiResponse;
import com.gocashapp.cabletv.services.CableTvService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CableTvController {

    private final CableTvService cableTvService;

    @PostMapping("/dstv")
    public ResponseEntity<ApiResponse> queryDstvStatus(@RequestBody TransactionStatusRequest transactionStatusRequest) {
        ApiResponse apiResponse = cableTvService.queryStatus(transactionStatusRequest);
        return ResponseEntity.ok(apiResponse);
    }

    @PostMapping("/gotv")
    public ResponseEntity<ApiResponse> queryGotvStatus(@RequestBody TransactionStatusRequest transactionStatusRequest) {
        ApiResponse apiResponse = cableTvService.queryStatus(transactionStatusRequest);
        return ResponseEntity.ok(apiResponse);
    }

    @PostMapping("/startimes")
    public ResponseEntity<ApiResponse> queryStartimesStatus(@RequestBody TransactionStatusRequest transactionStatusRequest) {
        ApiResponse apiResponse = cableTvService.queryStatus(transactionStatusRequest);
        return ResponseEntity.ok(apiResponse);
    }

    @PostMapping("/showmax")
    public ResponseEntity<ShowmaxTransactionStatusResponse> queryShowmaxStatus(@RequestBody TransactionStatusRequest transactionStatusRequest) {
        ShowmaxTransactionStatusResponse showmaxTransactionStatusResponse = cableTvService.getQueryStatus(transactionStatusRequest);
        return ResponseEntity.ok(showmaxTransactionStatusResponse);
    }

}
