package model;

import controller.Validation;

public class Hexadecimal {

    private String hexadecimal;

    public Hexadecimal() {
    }

    public Hexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    public void inputHexadecimal() {
        Validation v = new Validation();
        hexadecimal = v.checkHexadecimal("hexadecimal");
    }

    public String convertToBinary() {
        String dec = convertToDecimal();
        Decimal d = new Decimal(dec);
        return d.convertToBinary();
    }

    public String convertToDecimal() {
        int decimal = Integer.parseInt(hexadecimal, 16);
        return Integer.toString(decimal);
    }
}
