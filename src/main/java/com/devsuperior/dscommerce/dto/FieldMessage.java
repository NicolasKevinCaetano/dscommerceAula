package com.devsuperior.dscommerce.dto;

public class FieldMessage {

    private String fildName;
    private String massage;

    public FieldMessage(String fildName, String massage) {
        this.fildName = fildName;
        this.massage = massage;
    }

    public String getFildName() {
        return fildName;
    }

    public String getMassage() {
        return massage;
    }
}
