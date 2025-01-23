package com.np.teva.core.enumeration;


import java.util.HashMap;
import java.util.Map;

public enum SubCondicionAutorizadora {
    ROTACION_PARKINGS(1, 1),
    ABONADOS_PARKINGS(2, 2),
    EMPADRONADO_VEHICULO_PROPIEDAD(3, 3),
    EMPADRONADO_VEHICULO_RENTING(4, 3),
    EMPADRONADO_VEHICULO_LEASING(5, 3),
    EMPADRONADO_VEHICULO_RETRIBUCION_ESPECIE(6, 3),
    EMPADRONADO_VEHICULO_TRAMITE_ADQUISICION(7, 3),
    EMPADRONADO_VEHICULO_USUFRUCTO(8, 3),
    EMPADRONADO_VEHICULO_SUSTITUCION(9,  3),
    EMPADRONADO_PERMISOS_PUNTUALES(10, 3),
    PLAZA_GARAJE(11, 9),
    CONCESION_PAR(12, 10),
    PMR(13, 4),
    SERVICIOS_PROFESIONALES_PROPIEDAD(14, 5),
    SERVICIOS_PROFESIONALES_RENTING(15, 5),
    SERVICIOS_PROFESIONALES_LEASING(16, 5),
    SERVICIOS_PROFESIONALES_TRAMITE_ADQUISICION(17, 5),
    SERVICIOS_PROFESIONALES_VEHICULO_SUSTITUCION(19, 5),
    DIPLOMATICOS(20, 7),
    EXTRANJEROS(21, 6),
    TALLER_REPARACION_VEHICULOS(22, 8),
    MIGRADO(23, 11),
    ESPECIAL(24, 12),
    VTC_VEHICULO_PROPIEDAD(25, 13),
    VTC_VEHICULO_RENTING(26, 13),
    VTC_VEHICULO_LEASING(27,13),
    VTC_VEHICULO_TRAMITE_ADQUISICION(28, 13),
    VTC_VEHICULO_SUSTITUCION(30, 13),
    PERMANENTES_COLECTIVOS(31, 14),
    PUNTUALES_COLECTIVOS(32, 15),
    ESPECIAL_TRABAJADORES_NOCTURNOS(33, 12),
    SERVICIOS_PROFESIONALES_PRODUCTOS_PERECEDEROS(46, 5),
    SERVICIOS_PROFESIONALES_REPARTO_MERCANCIAS(47, 5),
    MERCADILLOS_RASTRO(48, 17),
    MERCADILLOS_CORNISA(49, 17),
    MERCADILLOS_AMBOS(50, 17),
    SERVICIOS_PROFESIONALES_REPARTO_PRENSA(52, 5),
    OTRO(99, 99);

    private int subcondicion;

    private int condicion;

    public int getCondicion() {
        return condicion;
    }

    public void setCondicion(int condicion) {
        this.condicion = condicion;
    }

    public int getSubcondicion() {
        return subcondicion;
    }

    public void setSubcondicion(int subcondicion) {
        this.subcondicion = subcondicion;
    }

    private SubCondicionAutorizadora(int subcondicion, int condicion) {
        this.subcondicion = subcondicion;
        this.condicion = condicion;
    }

    private static Map<Integer, SubCondicionAutorizadora> map = new HashMap<Integer, SubCondicionAutorizadora>();

    static {
        for (SubCondicionAutorizadora subCondicionAutorizadora : SubCondicionAutorizadora.values()) {
            map.put(subCondicionAutorizadora.subcondicion, subCondicionAutorizadora);
        }


    }

    public static SubCondicionAutorizadora value(int subcondicion) {
        if (map.containsKey(subcondicion)) {
            return map.get(subcondicion);
        } else {
            return SubCondicionAutorizadora.OTRO;
        }
    }
}
