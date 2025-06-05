package com.np.teva.core.bean;


import com.np.teva.core.enumeration.PermisoAcceso;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReglaAccesoBean implements Serializable {

    private String desRegla;

    private String distintivo;

    private String condicion;

    private String subcondicion;

    private String tipoVehiculo;

    private String fecIni;

    private String fecFin;

    private String horaInicio;

    private String horaFin;

    private String dayOfWeek;

    private String codTipoPerm;

    private PermisoAcceso estadoPerm;

    private Boolean indTienePermiso;

    private Boolean indDomiciliacion;

    private Boolean cumpleItinerario;

    private Boolean indHistorico;

    private String tipoConstruccion;

    private String tipoUso;

    private String tipoServicio;
}
