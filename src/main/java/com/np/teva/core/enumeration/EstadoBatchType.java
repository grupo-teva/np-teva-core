package com.np.teva.core.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum EstadoBatchType {
    OK(1),
    KO(2);

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private EstadoBatchType(final int codigo) {
        this.codigo = codigo;
    }

    private static Map<Integer, EstadoBatchType> map = new HashMap<>();

    static {
        for (EstadoBatchType estado : EstadoBatchType.values()) {
            map.put(estado.codigo, estado);
        }
    }

    public static EstadoBatchType value(int codigo) {
        if (map.containsKey(codigo)) {
            return map.get(codigo);
        } else {
            return EstadoBatchType.OK;
        }
    }
}
