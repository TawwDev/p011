package controller;

import java.util.Scanner;

public class Validation {

    private Scanner sc = new Scanner(System.in);
    private char[] binary = {0, 1};
    private char[] decimal = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private char[] hexa = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F'};

    public int getInt(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) {
                    return n;
                } else {
                    System.err.println("re-input");
                }
            } catch (NumberFormatException nfe) {
                System.err.println("re-input");
            }
        }
    }
    
    
    public String getString(String msg){
        while(true){
            System.out.print(msg);
            String s = sc.nextLine();
            if(!s.isEmpty()){
                return s;
            } else{
                System.err.println("Input must be not empty.");
            }
        }
    }
    
    public String checkBinaryAndDecimal(int base, String msg) {
        String value = "";
        char[] digitCheck = null;
        if (base == 2) {
            digitCheck = new char[]{'0', '1'};
        } else if (base == 10) {
            digitCheck = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        }
        while (true) {
            int s = getInt("Enter number " + msg + ":", 0, Integer.MAX_VALUE);
            String temp = Integer.toString(s);
            boolean flag = false;
            for (char ch : temp.toCharArray()){
                flag = false;
                for(char checkBase : digitCheck){
                    if(ch == checkBase){
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                    break;
                }
            }
            value = temp;
            return value;
            
        }
    }
    
    public String checkHexadecimal(String msg) {
        String value = "";
        char [] digitCheck = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f'};
        while (true) {
            String s = getString("Enter number " + msg + ":");
            boolean flag = false;
            for (char ch : s.toCharArray()){
                flag = false;
                for(char checkBase : digitCheck){
                    if(ch == checkBase){
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                    break;
                }
            }
            if(flag == false){
                System.err.println("Invalid input. Please re-enter a valid " + msg + ".");
            } else{
                value = s;
                return value;
            }
        }
    }
    
    public int getChoice(String number, String case1, String case2){
        System.out.println("1.Convert from " + number + " to " + case1);
        System.out.println("2.Convert from " + number + " to " + case2);
        int choice = getInt("Enter your choice:", 1, 2);
        return choice;
    }
}
