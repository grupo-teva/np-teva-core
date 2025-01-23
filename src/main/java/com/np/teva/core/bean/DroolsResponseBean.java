package com.np.teva.core.bean;


import java.io.Serializable;

public class DroolsResponseBean implements Serializable {

    private DroolsResult result;

    private String errorMessage;

    public DroolsResponseBean(){

    }

    public DroolsResult getResult() {
        return result;
    }

    public void setResult(DroolsResult result) {
        this.result = result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
