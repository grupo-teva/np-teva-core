package com.np.teva.core.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransitoBean implements Serializable {

    private UUID id;

    private UUID idCaptura;

    private Timestamp tmsTransito;

    private Integer pdc;

    private String plate;

    private String readPlate;

    private boolean whiteList;

    private Integer transitoType;

    private Integer estadoImportacion;

    private boolean Into;

    private String imagesPath;

    private boolean pteImporter;
}
