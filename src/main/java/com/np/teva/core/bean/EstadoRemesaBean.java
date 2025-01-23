package com.np.teva.core.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstadoRemesaBean implements Serializable {
        private int codigoZona;

        private Date fechaSancion;

        private int codigoEstadoRemesa;

        private Date fechaActualizacion;

        private int codigoUsuario;
}
