package com.np.teva.core.bean;


import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

public class ResultRestStore<T> implements Serializable {

    private T result;

    private String errorMessage = StringUtils.EMPTY;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
