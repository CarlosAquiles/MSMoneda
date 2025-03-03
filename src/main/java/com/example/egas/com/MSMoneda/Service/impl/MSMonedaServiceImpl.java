package com.example.egas.com.MSMoneda.Service.impl;

import com.example.egas.com.MSMoneda.Model.Moneda;
import com.example.egas.com.MSMoneda.Repository.IMSMonedaRepository;
import com.example.egas.com.MSMoneda.Service.IMSMonedaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MSMonedaServiceImpl implements IMSMonedaService {

    private final IMSMonedaRepository monedaRepository;

    @Override
    public Mono<List<Moneda>> listar() {
        return Mono.just(monedaRepository.findAll());
    }
}
