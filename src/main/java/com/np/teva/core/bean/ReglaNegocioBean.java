package com.np.teva.core.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReglaNegocioBean implements Serializable {

    private Integer reglaId;

    private String descripcion;
}
