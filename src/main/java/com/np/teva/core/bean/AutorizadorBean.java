package com.np.teva.core.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AutorizadorBean implements Serializable {

    public int codAutorizador;

    public int codRepresentante;

    public Timestamp fechaAlta;

    public Timestamp fechaCaducidad;
}
