package com.gocashapp.cabletv.entities;

import lombok.Data;

@Data
public class TransactionDate {
    private String date;
    private int timezone_type;
    private String timezone;

}
