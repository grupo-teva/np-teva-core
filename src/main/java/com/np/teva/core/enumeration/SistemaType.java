package com.np.teva.core.enumeration;


import java.util.HashMap;
import java.util.Map;

public enum SistemaType {
    JLISTENER(1),
    IMPORTER(2),
    DON_LIMPIO(3),
    PUNISHER(4),
    WALL_E(5),
    SIATRA_BOT(6),
    HALLMARKBOT(7),
    APR(8),
    DGT_PADRON(9),
    FRONT_END(10),
    ACOT(11),
    DGT_MOVE(12),
    TIGRETON(13),
    BATCHMAN(14),
    MR_PROPPER(15),
    ARTHUR_MILLER(16),
    TAXI(17),
    VALIDADOR(18),
    TEVALIANO(19),
    SAMARITANO(20),
    RASTREATOR(21),
    MITE(22),
    VALIDADOR_TRANSITOS(23),
    EXENCION_ACCESO(24),
    REMESADO_AUTOMATICO(25),
    NO_DEFINIDO(99);

    private int indexSistemaType;
    private static Map<Integer, SistemaType> map = new HashMap();

    public int getIndexSistemaType() {
        return this.indexSistemaType;
    }

    private SistemaType(int indexSistemaType) {
        this.indexSistemaType = indexSistemaType;
    }

    public static SistemaType valueOf(int indexSistemaType) {
        return map.containsKey(indexSistemaType) ? (SistemaType)map.get(indexSistemaType) : NO_DEFINIDO;
    }

    static {
        SistemaType[] var0 = values();
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            SistemaType sistemaType = var0[var2];
            map.put(sistemaType.indexSistemaType, sistemaType);
        }
    }
}
