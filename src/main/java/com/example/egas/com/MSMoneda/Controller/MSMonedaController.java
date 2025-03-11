package com.example.egas.com.MSMoneda.Controller;

import com.example.egas.com.MSMoneda.Model.Moneda;
import com.example.egas.com.MSMoneda.Service.IMSMonedaService;
import com.example.egas.com.MSMoneda.response.CambioRequest;
import com.example.egas.com.MSMoneda.response.CambioResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/msMoneda")
@RequiredArgsConstructor
public class MSMonedaController {

    private final IMSMonedaService monedaService;

    @GetMapping("/mono/listarMoneda")
    public Mono<List<Moneda>> listarMoneda() {
        return monedaService.listarMoneda();
    }

    //("/{id}")

    @GetMapping("/mono/obtenerCambio/{idMoneda}/{cantidad}")
    public Mono<CambioResponse> obtenerCambio(@PathVariable Integer idMoneda, @PathVariable Integer cantidad) {
        return monedaService.obtenerCambio(idMoneda, cantidad);
    }

    @PostMapping("/mono/obtenerCambio2")
    public Mono<CambioResponse> obtenerCambio2(@RequestBody CambioRequest cambioRequest) {
        return monedaService.obtenerCambio2(cambioRequest);
    }

    @GetMapping("/mono/obtenerCambio3")
    public Mono<CambioResponse> obtenerCambio3(@RequestParam Integer idMoneda, @RequestParam Integer cantidad) {
        BigDecimal cantidadDecimal = new BigDecimal(cantidad);
        CambioRequest cambioRequest = new CambioRequest(idMoneda, cantidadDecimal);
        return monedaService.obtenerCambio3(cambioRequest);
    }

}
