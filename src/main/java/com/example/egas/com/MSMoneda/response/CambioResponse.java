package com.example.egas.com.MSMoneda.response;

import com.example.egas.com.MSMoneda.Model.Moneda;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CambioResponse {

    private Moneda moneda;
    private BigDecimal totalCambio;
}
