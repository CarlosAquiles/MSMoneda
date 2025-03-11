package com.example.egas.com.MSMoneda.Service;

import com.example.egas.com.MSMoneda.Model.Moneda;
import com.example.egas.com.MSMoneda.response.CambioRequest;
import com.example.egas.com.MSMoneda.response.CambioResponse;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.List;

public interface IMSMonedaService {

    Mono<List<Moneda>> listarMoneda();

    Mono<CambioResponse> obtenerCambio(Integer idMoneda, Integer cantidad);

    Mono<CambioResponse> obtenerCambio2(CambioRequest cambioRequest);

    Mono<CambioResponse> obtenerCambio3(CambioRequest cambioRequest);
}
