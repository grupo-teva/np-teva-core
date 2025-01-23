package com.np.teva.core.enumeration;


import java.util.HashMap;
import java.util.Map;

public enum TipoVehiculosConstruccion {

    CICLOMOTOR("03"),
    MOTOCICLETA("04"),
    MOTO_CARRO("05"),
    CUATRICICLOS_3_RUEDAS("06"),
    TURISMOS("10"),
    AUTOBUS("11"),
    AUTOBUS_3500("12"),
    AUTOBUS_ARTICULADO("13"),
    AUTOBUS_MIXTO("14"),
    AUTOBUS_2_PISOS("16"),
    PICK_UP("17"),
    CAMION("20"),
    CAMION_3500("21"),
    CAMION_12000("22"),
    TRACTOCAMION("23"),
    FURGON("24"),
    FURGON_3500("25"),
    FURGON_12000("26"),
    DERIVADO_TURISMO("30"),
    VEHICULO_MIXTO("31"),
    AUTO_CARAVANA("32"),
    AUTO_CARAVANA_3500("33"),
    MILITARES("70"),
    OTROS("00");

    // FALTAN ESTO QUE ESTAN EN LA WEB
    // 23,29,32,50,66

    private String tipoConstruccion;

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    private TipoVehiculosConstruccion(final String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    private static Map<String, TipoVehiculosConstruccion> map = new HashMap<String, TipoVehiculosConstruccion>();

    static {
        for (TipoVehiculosConstruccion tipoVehiculosConstruccion : TipoVehiculosConstruccion.values()) {
            map.put(tipoVehiculosConstruccion.tipoConstruccion, tipoVehiculosConstruccion);
        }
    }


    public static TipoVehiculosConstruccion valueOfTipoVehiculosConstruccion(String tipoConstruccion) {
        if (map.containsKey(tipoConstruccion)) {
            return map.get(tipoConstruccion);
        } else {
            return TipoVehiculosConstruccion.OTROS;
        }
    }
}
