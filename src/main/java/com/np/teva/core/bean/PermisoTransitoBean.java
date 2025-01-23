package com.np.teva.core.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PermisoTransitoBean {

    private UUID idTransito;

    private long permiso;

    private int tipoPermiso;

    private int condicionAutorizadora;

    private int condicionSubautorizadora;
}
