package com.np.teva.core.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonaBean implements Serializable {

    private int codigoPersona;

    private int tipoDocumento;

    private String numeroDocumento;

    private boolean personaFisica;

    private String nombre;

    private String primerApellido;

    private String segundoApellido;

    private boolean empadronado;
}
