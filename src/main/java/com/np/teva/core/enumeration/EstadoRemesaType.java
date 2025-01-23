package com.np.teva.core.enumeration;


import java.util.HashMap;
import java.util.Map;

public enum EstadoRemesaType {
    NO_VALIDABLE(1),
    PENDIENTE_VALIDAR(2),
    VALIDADO(3),
    VALIDACION_CERRADA(4),
    QC(5),
    QC_CERRADO(6),
    REMESA_EN_PROCESO(7),
    REMESA_ENVIADA(8);

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setDodigo(int codigo) {
        this.codigo = codigo;
    }

    private EstadoRemesaType(final int codigo) {
        this.codigo = codigo;
    }

    private static Map<Integer, EstadoRemesaType> map = new HashMap<Integer, EstadoRemesaType>();

    static {
        for (EstadoRemesaType estado : EstadoRemesaType.values()) {
            map.put(estado.codigo, estado);
        }
    }

    public static EstadoRemesaType value(int codigo) {
        if (map.containsKey(codigo)) {
            return map.get(codigo);
        } else {
            return EstadoRemesaType.NO_VALIDABLE;
        }
    }

}
