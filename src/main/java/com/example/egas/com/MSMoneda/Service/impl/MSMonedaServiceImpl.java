package com.example.egas.com.MSMoneda.Service.impl;

import com.example.egas.com.MSMoneda.Model.Moneda;
import com.example.egas.com.MSMoneda.Repository.IMSMonedaRepository;
import com.example.egas.com.MSMoneda.Service.IMSMonedaService;
import com.example.egas.com.MSMoneda.response.CambioResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MSMonedaServiceImpl implements IMSMonedaService {

    private final IMSMonedaRepository monedaRepository;

    @Override
    public Mono<List<Moneda>> listar() {
        return Mono.just(monedaRepository.findAll());
    }

    @Override
    public Mono<CambioResponse> obtenerMoneda(Integer idMoneda, Integer cantidad) {

        return Mono.justOrEmpty(monedaRepository.findById(idMoneda)).map(monedaHallada -> {

            BigDecimal cantidadDecimal = new BigDecimal(cantidad);
            BigDecimal totalCambio = monedaHallada.getValMoneda().multiply(cantidadDecimal);
            CambioResponse cambioResponse = new CambioResponse(monedaHallada, totalCambio);
            return cambioResponse;
        });

    }


}
