package com.np.teva.core.bean;


import java.io.Serializable;

public class DroolsResult implements Serializable {
    private boolean result;
    private String finalRule;

    public DroolsResult() {
    }

    public boolean isResult() {
        return this.result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getFinalRule() {
        return this.finalRule;
    }

    public void setFinalRule(String finalRule) {
        this.finalRule = finalRule;
    }
}
