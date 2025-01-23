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
public class AccesoIntranetBean implements Serializable {
    private String plate;

    private long permiso;

    private int tipoPermiso;

    private int condicionAutorizadora;

    private int condicionSubautorizadora;

    private int codPerfil;

    private Integer codColectivo;

    private boolean parkingColectivo;
}
