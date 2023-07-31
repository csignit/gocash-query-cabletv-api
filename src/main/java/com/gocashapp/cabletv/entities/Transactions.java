package com.gocashapp.cabletv.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Transactions {
    private String status;
    private String product_name;
    private String unique_element;
    private int unit_price;
    private int quantity;
    private Object service_verification; // Change the type to a suitable one if available
    private String channel;
    private int commission;
    private int total_amount;
    private Object discount; // Change the type to a suitable one if available
    private String type;
    private String email;
    private String phone;
    private Object name; // Change the type to a suitable one if available
    private int convenience_fee;
    private int amount;
    private String platform;
    private String method;
    private String transactionId;
}
