package com.np.teva.core.bean;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class AccesosBean implements Serializable {
    private String plate;
    private String prueba;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd"
    )
    @JsonDeserialize(
            using = LocalDateDeserializer.class
    )
    @JsonSerialize(
            using = LocalDateSerializer.class
    )
    private LocalDate day;
    private long permiso;
    private int tipoPermiso;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "HH:mm:ss"
    )
    @JsonDeserialize(
            using = LocalTimeDeserializer.class
    )
    @JsonSerialize(
            using = LocalTimeSerializer.class
    )
    private LocalTime inicioVigencia;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "HH:mm:ss"
    )
    @JsonDeserialize(
            using = LocalTimeDeserializer.class
    )
    @JsonSerialize(
            using = LocalTimeSerializer.class
    )
    private LocalTime finVigencia;
    private int condicionAutorizadora;
    private int condicionSubautorizadora;
    private int codPerfil;
    private Integer codColectivo;
    private boolean parkingColectivo;

    public AccesosBean() {
    }

    public LocalTime getInicioVigencia() {
        return this.inicioVigencia;
    }

    public void setInicioVigencia(LocalTime inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public LocalTime getFinVigencia() {
        return this.finVigencia;
    }

    public void setFinVigencia(LocalTime finVigencia) {
        this.finVigencia = finVigencia;
    }

    public int getCondicionAutorizadora() {
        return this.condicionAutorizadora;
    }

    public void setCondicionAutorizadora(int condicionAutorizadora) {
        this.condicionAutorizadora = condicionAutorizadora;
    }

    public int getCondicionSubautorizadora() {
        return this.condicionSubautorizadora;
    }

    public void setCondicionSubautorizadora(int condicionSubautorizadora) {
        this.condicionSubautorizadora = condicionSubautorizadora;
    }

    public String getPlate() {
        return this.plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public LocalDate getDay() {
        return this.day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public long getPermiso() {
        return this.permiso;
    }

    public void setPermiso(long permiso) {
        this.permiso = permiso;
    }

    public int getTipoPermiso() {
        return this.tipoPermiso;
    }

    public void setTipoPermiso(int tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public int getCodPerfil() {
        return this.codPerfil;
    }

    public void setCodPerfil(int codPerfil) {
        this.codPerfil = codPerfil;
    }

    public Integer getCodColectivo() {
        return this.codColectivo;
    }

    public void setCodColectivo(Integer codColectivo) {
        this.codColectivo = codColectivo;
    }

    public boolean isParkingColectivo() {
        return this.parkingColectivo;
    }

    public void setParkingColectivo(boolean parkingColectivo) {
        this.parkingColectivo = parkingColectivo;
    }
}
