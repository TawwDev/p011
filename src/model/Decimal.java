/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Validation;

public class Decimal {
    
    private String decimal;
    private char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public Decimal() {
    }

    public Decimal(String decimal) {
        this.decimal = decimal;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

    public void inputDecimal(){
        Validation v = new Validation();
        decimal = v.checkBinaryAndDecimal(10, "decimal");
    }
    
    public String convertToBinary() {   
        String binary = Integer.toBinaryString(Integer.parseInt(decimal));
        return binary;
    }

    public String convertToHexadecimal() {
        String hex = "";
        int dec = Integer.parseInt(decimal);
        if(dec == 0){
            return "0";
        }
        while (dec != 0) {
            int mod = dec % 16;
            hex = hexa[mod] + hex;
            dec /= 16;
        }
        return hex;
    }

}
