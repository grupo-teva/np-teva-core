package com.np.teva.core.enumeration;


import java.util.HashMap;
import java.util.Map;

public enum ImportStateType {
    REPETIDO(0),
    CAMARA_SIN_SANCION(1),
    SALIENDO(2),
    LISTA_BLANCA(3),
    SANCIONABLE(4),
    VALIDADO(5),
    NO_SANCIONABLE(6),
    ERROR_IMPORTER(7),
    ERROR_CRC(8),
    PTE_IMPORTACION(9),
    CAPTURA_ERRONEA(10),
    DESCARTE_VALIDACION(11),
    PERMISO_EXPLICITO(12),
    RECHAZADO(13),
    CORTE_DESVIO(14),
    INDULTADO(15),
    PERMISO_NORMA(16),
    NO_DEFINIDO(99);

    private int indexImportStateType;
    private static Map<Integer, ImportStateType> map = new HashMap();

    public int getIndexImportStateType() {
        return this.indexImportStateType;
    }

    private ImportStateType(int indexImportStateType) {
        this.indexImportStateType = indexImportStateType;
    }

    public static ImportStateType valueOf(int indexImportStateType) {
        return map.containsKey(indexImportStateType) ? (ImportStateType)map.get(indexImportStateType) : NO_DEFINIDO;
    }

    static {
        ImportStateType[] var0 = values();
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            ImportStateType importStateType = var0[var2];
            map.put(importStateType.indexImportStateType, importStateType);
        }

    }
}
