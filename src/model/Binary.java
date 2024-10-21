package model;

import controller.Validation;

public class Binary {

    private String binary;

    public Binary() {
    }

    public Binary(String binary) {
        this.binary = binary;
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    public void inputBinary() {
        Validation v = new Validation();
        binary = v.checkInput("binary", 2);
    }

    public String convertToDecimal() {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }

    public String convertToHexadecimal() {
        Validation v = new Validation();
        Decimal d = new Decimal(convertToDecimal());
        String hex = d.convertToHexadecimal();
        return hex;
    }
}
