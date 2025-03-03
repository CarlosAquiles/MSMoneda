package com.example.egas.com.MSMoneda.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "moneda")
public class Moneda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMoneda")
    private Integer    idMoneda;

    @Column(name = "desMoneda")
    private String     desMoneda;

    @Column(name = "codMoneda")
    private String     codMoneda;

    @Column(name = "valMoneda")
    private BigDecimal valMoneda;

}
