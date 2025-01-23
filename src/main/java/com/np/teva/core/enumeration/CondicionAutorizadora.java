package com.np.teva.core.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum CondicionAutorizadora {
    ROTACION(1),
    ABONADO(2),
    EMPADRONADO(3),
    PMR(4),
    SERVICIOS_PROFESIONALES(5),
    EXTRANJEROS(6),
    DIPLOMATICOS(7),
    TALLER_REPARACION_VEHICULOS(8),
    PLAZA_DE_GARAJE(9),
    CONCESION_PAR(10),
    MIGRADO(11),
    ESPECIAL(12),
    VTC(13),
    PERMANENTES(14),
    PUNTUALES(15),
    OTRO(99);

    private int codicion;

    public int getCodicion() {
        return codicion;
    }

    public void setCodicion(int codicion) {
        this.codicion = codicion;
    }

    private CondicionAutorizadora(final int codicion) {
        this.codicion = codicion;
    }

    private static Map<Integer, CondicionAutorizadora> map = new HashMap<Integer, CondicionAutorizadora>();

    static {
        for (CondicionAutorizadora condicionAutorizadora : CondicionAutorizadora.values()) {
            map.put(condicionAutorizadora.codicion, condicionAutorizadora);
        }
    }

    public static CondicionAutorizadora value(int codicion) {
        if (map.containsKey(codicion)) {
            return map.get(codicion);
        } else {
            return CondicionAutorizadora.OTRO;
        }
    }
}
