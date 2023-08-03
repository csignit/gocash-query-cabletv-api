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
    private Integer unit_price;
    private Integer quantity;
    private Object service_verification; // Change the type to a suitable one if available
    private String channel;
    private Integer commission;
    private Integer total_amount;
    private Double discount; // Change the type to a suitable one if available
    private String type;
    private String email;
    private String phone;
    private Object name; // Change the type to a suitable one if available
    //    private String extras;
    private Integer convenience_fee;
    private Double amount;
    private String platform;
    private String method;
    private String transactionId;
}
