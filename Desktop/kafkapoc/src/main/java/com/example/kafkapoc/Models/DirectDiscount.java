package com.example.kafkapoc.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectDiscount {

    private String sku;
    private String directDiscount;
}
