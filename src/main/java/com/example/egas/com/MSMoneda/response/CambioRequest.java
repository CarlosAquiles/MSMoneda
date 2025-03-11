package com.example.egas.com.MSMoneda.response;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CambioRequest {
    private Integer    idMoneda;
    private BigDecimal totalCambio;

}
