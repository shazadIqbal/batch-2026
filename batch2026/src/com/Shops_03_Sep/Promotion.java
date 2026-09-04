package com.Shops_03_Sep;

public class Promotion {

    private String code;
    private PromotionType type;
    private String value;

    public Promotion(String code, PromotionType type, String value) {
        this.code = code;
        this.type = type;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public PromotionType getType() {
        return type;
    }

    public void setType(PromotionType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "code='" + code + '\'' +
                ", type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}