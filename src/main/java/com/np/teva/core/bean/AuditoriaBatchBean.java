package com.np.teva.core.bean;

import com.np.teva.core.enumeration.EstadoBatchType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuditoriaBatchBean {

    private int codAuditoriaBatch;

    private String nombreBatch;

    private LocalDateTime fechaInicio;

    private LocalDateTime fechaFin;

    private EstadoBatchType estadoBatch;

    private String descripcionError;

}
