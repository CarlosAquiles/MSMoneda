package com.example.egas.com.MSMoneda.Controller;

import com.example.egas.com.MSMoneda.Model.Moneda;
import com.example.egas.com.MSMoneda.Service.IMSMonedaService;
import com.example.egas.com.MSMoneda.response.CambioResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
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

    //("/{id}")

    @GetMapping("/mono/obtenerCambio/{idMoneda}/{cantidad}")
    public Mono<CambioResponse> getObtenerCambio(@PathVariable Integer idMoneda, @PathVariable Integer cantidad) {
        return monedaService.obtenerMoneda(idMoneda, cantidad);
    }

}
