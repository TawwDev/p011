package controller;

import java.util.Scanner;

public class Validation {

    private Scanner sc = new Scanner(System.in);

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

    public String getString(String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine();
            if (!s.isEmpty()) {
                return s;
            } else {
                System.err.println("Input must be not empty.");
            }
        }
    }

    public String checkInput(String msg, int mode){
        while(true){
            String s = getString("Enter number " + msg + ":");
            if(mode == 2 && s.matches("[01]+")){
                return s;
            } else if(mode == 10 && s.matches("\\d+")){
                return s;
            } else if(mode == 16 && s.matches("[0-9a-fA-F]+")){
                return s;
            } else{
                System.out.println("Invalid input, please re-input");
            }
        }
    }

    public int getChoice(String number, String case1, String case2) {
        System.out.println("1.Convert from " + number + " to " + case1);
        System.out.println("2.Convert from " + number + " to " + case2);
        int choice = getInt("Enter your choice:", 1, 2);
        return choice;
    }
}
