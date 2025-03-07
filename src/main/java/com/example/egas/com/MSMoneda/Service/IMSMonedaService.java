package com.example.egas.com.MSMoneda.Service;

import com.example.egas.com.MSMoneda.Model.Moneda;
import com.example.egas.com.MSMoneda.response.CambioResponse;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.List;

public interface IMSMonedaService {

    Mono<List<Moneda>> listar();

    Mono<CambioResponse> obtenerMoneda(Integer idMoneda, Integer cantidad);
}
