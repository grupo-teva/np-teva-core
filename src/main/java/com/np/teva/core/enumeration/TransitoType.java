package com.np.teva.core.enumeration;


import java.util.HashMap;
import java.util.Map;

public enum TransitoType {
    PERMITIDO(0),
    EXENTO(1),
    SANCIONABLE(2),
    SANCIONADO(3),
    REINCIDENTE(4),
    NO_SANCIONABLE(5),
    REPETIDO(6),
    NO_VALIDO(7),
    NO_DEFINIDO(99);

    private int indexTransitoType;
    private static Map<Integer, TransitoType> map = new HashMap();

    public int getIndexTransitoType() {
        return this.indexTransitoType;
    }

    private TransitoType(int indexTransitoType) {
        this.indexTransitoType = indexTransitoType;
    }

    public static TransitoType valueOf(int indexTransitoType) {
        return map.containsKey(indexTransitoType) ? (TransitoType)map.get(indexTransitoType) : NO_DEFINIDO;
    }

    static {
        TransitoType[] var0 = values();
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            TransitoType transitoType = var0[var2];
            map.put(transitoType.indexTransitoType, transitoType);
        }

    }
}
