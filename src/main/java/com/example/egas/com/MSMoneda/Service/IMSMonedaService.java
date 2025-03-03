package com.example.egas.com.MSMoneda.Service;

import com.example.egas.com.MSMoneda.Model.Moneda;
import reactor.core.publisher.Mono;

import java.util.List;

public interface IMSMonedaService {

    Mono<List<Moneda>> listar();
}
