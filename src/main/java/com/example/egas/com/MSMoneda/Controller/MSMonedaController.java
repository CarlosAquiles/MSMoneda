package com.example.egas.com.MSMoneda.Controller;

import com.example.egas.com.MSMoneda.Model.Moneda;
import com.example.egas.com.MSMoneda.Service.IMSMonedaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/msMoneda")
@RequiredArgsConstructor
public class MSMonedaController {

    private final IMSMonedaService monedaService;

    @GetMapping("/mono/listar")
    public Mono<List<Moneda>> getListarMoneda() {
        return monedaService.listar();
    }
}
