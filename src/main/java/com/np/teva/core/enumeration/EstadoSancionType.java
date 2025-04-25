package com.np.teva.core.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum EstadoSancionType {
    NUEVO(0),
    VALIDADO(1),
    CAPTURA_ERRONEA(2),
    DESCARTADO(3),
    REINCIDENTE(4),
    CASTIGADO(5),
    NO_VALIDO(6),
    INDULTADO(7),
    INFORMADO(8),
    PROCRASTINADO(9),
    RECHAZADO(10),
    ERROR_SIATRA(11),
    QC(12),
    VALIDADO_QC(13),
    PDC_DESCARTADO(14),
    DESCARTADO_VALIDADOR_TRANSITOS(15),
    DESCARTADO_QC(16),
    JUSTIFICACION_ACCESO(17),
    DESCARTADO_JUSTIFICACION_ACCESO(18),
    DESCARTADO_PERMISO_RETROACTIVO(19),
    DESCARTADO_QC_PERMISO_RETROACTIVO(20),
    CORTE_DESVIO(21),
    DESCARTADO_8MIN (20);

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private EstadoSancionType(final int codigo) {
        this.codigo = codigo;
    }

    private static Map<Integer, EstadoSancionType> map = new HashMap<Integer, EstadoSancionType>();

    static {
        for (EstadoSancionType estado : EstadoSancionType.values()) {
            map.put(estado.codigo, estado);
        }
    }

    public static EstadoSancionType value(int codigo) {
        if (map.containsKey(codigo)) {
            return map.get(codigo);
        } else {
            return EstadoSancionType.NO_VALIDO;
        }
    }

}
