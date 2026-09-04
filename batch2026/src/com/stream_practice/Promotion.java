package com.stream_practice;

public class Promotion {
    private String code;
    private PromotionType promotionType;
    private String value;


    public Promotion(String code, PromotionType promotionType, String value) {
        this.code = code;
        this.promotionType = promotionType;
        this.value = value;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public PromotionType getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(PromotionType promotionType) {
        this.promotionType = promotionType;
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
                ", promotionType=" + promotionType +
                ", value='" + value + '\'' +
                '}';
    }
}
