
package view;

import controller.Validation;
import java.util.Scanner;
import model.Binary;
import model.Decimal;
import model.Hexadecimal;

public class Menu {
    
    private void menu(){
        System.out.println("========Change base program========");
        System.out.println("1.Change Binary");
        System.out.println("2.Change Decimal");
        System.out.println("3.Change Hexadecimal");
        System.out.println("4.Exit");
    }
    
    public void display(){
        Scanner sc = new Scanner (System.in);
        Validation v = new Validation();
        int n;
        do{
            menu();
            n = v.getInt("Your choice:", 1, 4);
            switch(n){
                case 1:
                    Binary bin = new Binary();
                    bin.inputBinary();
                    int choice = v.getChoice("binary", "decimal", "hexadecimal");
                    if(choice == 1){
                        System.out.println("Decimal: " + bin.convertToDecimal());    
                    } else if(choice == 2){
                        System.out.println("Hexadecimal: "+ bin.convertToHexadecimal());
                        
                    }
                    break;
                case 2:
                    Decimal dec = new Decimal();
                    dec.inputDecimal();
                    int choice2 = v.getChoice("decimal", "binary", "hexadecimal");
                    if(choice2 == 1){
                        System.out.println("Binary: " + dec.convertToBinary());                 
                    } else if(choice2 == 2){
                        System.out.println("Hexadecimal: " + dec.convertToHexadecimal());  
                    }
                    break;
                case 3:
                    Hexadecimal hex = new Hexadecimal();
                    hex.inputHexadecimal();
                    int choice3 = v.getChoice("hexadecimal", "binary", "decimal");
                    if(choice3 == 1){
                        System.out.println("Binary: " + hex.convertToBinary());                 
                    } else if(choice3 == 2){
                        System.out.println("Decimal: " + hex.convertToDecimal());                        
                    }
                    break;
                case 4:
                    break;
            }
        } while(n != 4);
    }
}
