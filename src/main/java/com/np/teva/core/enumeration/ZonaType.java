package com.np.teva.core.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum ZonaType {
    ZBE(1),
    CASCO_HISTORICO(2),
    CARRIL_BUS(3),
    VEHICULO_PESADO(4),
    NO_DEFINIDO(99);

    private int codZona;
    private static Map<Integer, ZonaType> map = new HashMap();

    public int getCodZona() {
        return this.codZona;
    }

    private ZonaType(int codZona) {
        this.codZona = codZona;
    }

    public static ZonaType valueOf(int codZona) {
        return map.containsKey(codZona) ? (ZonaType)map.get(codZona) : NO_DEFINIDO;
    }

    static {
        ZonaType[] var0 = values();
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            ZonaType zonaType = var0[var2];
            map.put(zonaType.codZona, zonaType);
        }

    }
}
