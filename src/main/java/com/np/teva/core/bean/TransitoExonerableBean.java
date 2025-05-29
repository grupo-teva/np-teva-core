package com.np.teva.core.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransitoExonerableBean implements Serializable {

    private UUID codTransito;

    private UUID codSancion;

    private String matricula;

    private boolean entrada;

    private Timestamp fechaTransito;

    private int codPdc;
}
