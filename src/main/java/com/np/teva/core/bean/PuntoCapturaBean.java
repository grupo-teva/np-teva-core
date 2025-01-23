package com.np.teva.core.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PuntoCapturaBean implements Serializable {
    private Integer codPDC;

    private String nombre;

    private Integer codGrupoPDC;

    private Boolean indEntrada;

    private Integer numCarril;

    private Boolean indSancionador;

    private Integer codBarrio;

    private String txtUbicacion;

    private String codPuertaAyto;

    private String txtNomPuertaAyto;

    private String txtTipoVia;

    private String txtNombreVia;

    private Integer numVia;

    private String txtCalificador;

    private Boolean indBajaOcupacion;

    private Integer codZona;

    private Date fecBaja;

    private Boolean indActivo;
}
