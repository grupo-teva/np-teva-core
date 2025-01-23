package com.np.teva.core.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeriodoBean implements Serializable {

    private Integer codPeriodo;

    private Integer codHorario;

    private String diaInicio;

    private String diaFin;

    private Date fecInicio;

    private Date fecFin;

    private Time horaInicio;

    private Time horaFin;

    private Date fecBaja;

    private boolean indActivo;
}
