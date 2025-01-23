package com.np.teva.core.bean;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoBean implements Serializable {

    private String matricula;

    private Timestamp fecMatriculacion;

    @JsonIgnore
    private String provincia;

    @JsonIgnore
    private String municipio;

    @JsonIgnore
    private String codigoPostal;

    private Integer distintivoAmbiental;

    @JsonIgnore
    private String letraDistintivo;

    private String tipoIndustria;

    private Boolean historico;

    private String servicio;

    private Timestamp creacion;

    @JsonIgnore
    private String categoriaEuropea;

    private Integer sistema;

    private Integer marca;

    private String tipoVehiculo;

    private String tipoServicio;

    private String matriculaPadre;

    private Boolean padronAyto;

    private Boolean estado;

    public Boolean isDomiciliado(String municipio) {
        return this.municipio.equals(municipio);
    }
}
