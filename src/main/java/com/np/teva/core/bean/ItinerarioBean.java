package com.np.teva.core.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItinerarioBean implements Serializable {

    private Integer codItinerario;

    private Integer codGrupoPDC;

    private Integer codSubcondAut;

    private Integer codPerfil;

    private Integer codTipoUsuario;

    private Date fecBaja;

    private boolean indActivo;
}
