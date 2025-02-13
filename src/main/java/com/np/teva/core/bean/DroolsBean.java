package com.np.teva.core.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DroolsBean implements Serializable {
    private TransitoBean transitoBean;

    private VehiculoBean vehiculoBean;

    private List<AccesosBean> accesosBeanList = Collections.EMPTY_LIST;

    private List<ReglaAccesoBean> reglas = Collections.EMPTY_LIST;

    private boolean laborable;

    private Boolean domiciliado;

    private Boolean historico;
}
