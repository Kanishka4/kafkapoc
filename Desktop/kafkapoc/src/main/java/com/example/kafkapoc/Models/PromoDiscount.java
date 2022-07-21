package com.example.kafkapoc.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PromoDiscount {

    private String sku;
    private String promoDiscount;
}
