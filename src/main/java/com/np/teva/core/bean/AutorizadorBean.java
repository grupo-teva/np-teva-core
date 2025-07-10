package com.np.teva.core.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AutorizadorBean implements Serializable {

    private int codigoAutorizador;

    private int codigoCondicionAutorizadora;

    private int codigoRepresentado;

    private int codigoRepresentante;

    private LocalDate fechaAlta;

    private LocalDate fechaCaducidad;
}
