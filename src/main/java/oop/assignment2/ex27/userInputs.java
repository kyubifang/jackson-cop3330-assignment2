package oop.assignment2.ex27;

import java.util.regex.Pattern;

public class userInputs {
    public String firstName(String fn){
        String error1 = "000";
        int fnLength = fn.length();
        char[] e1 = error1.toCharArray();
        if(fnLength < 1){
            // 1## = The first name must be filled in.
            e1[0] = '1';
        }
        if(fnLength < 2) {
            // #1# = The first name must be at least 2 characters long.
            e1[1] = '1';
        }
        if(!Pattern.matches("[a-zA-Z]+", fn)) {
            // ##1 = The first name must only consist of letters.
            e1[2] = '1';
        }
        error1 = String.valueOf(e1);
        return error1;
    }

    public String lastName(String ln){
        String error2 = "000";
        int lnLength = ln.length();
        char[] e2 = error2.toCharArray();
        if(lnLength < 1){
            // 1## = The last name must be filled in.
            e2[0] = '1';
        }
        if(lnLength < 2) {
            // #1# = The last name must be at least 2 characters long.
            e2[1] = '1';
        }
        if(!Pattern.matches("[a-zA-Z]+", ln)) {
            // ##1 = The last name must only consist of letters.
            e2[2] = '1';
        }
        error2 = String.valueOf(e2);
        return error2;
    }

    public String zipCode(String zc){
        String error3 = "0";
        int zcLength = zc.length();
        char[] e3 = error3.toCharArray();
        if(zcLength != 5 || !Pattern.matches("[0-9]+", zc)){
            //The zipcode must be a 5 digit number.
            e3[0] = '1';
        }
        error3 = String.valueOf(e3);
        return error3;
    }

    public String employeeID(String ei){
        // 1 = The employee ID must be in the format of AA-1234.
        String error4 = "1";
        int eiLength = ei.length();
        char[] e4 = error4.toCharArray();
        if(eiLength == 7) {
            if(Character.isLetter(ei.charAt(0)) && Character.isLetter(ei.charAt(1))){
                if(!Character.isLetterOrDigit(ei.charAt(2))) {
                    if(Character.isDigit(ei.charAt(3)) && Character.isDigit(ei.charAt(4)) && Character.isDigit(ei.charAt(5)) && Character.isDigit(ei.charAt(6))) {
                        e4[0] = '0';
                    }
                }

            }

        }

        error4 = String.valueOf(e4);
        return error4;
    }

    public String validateInput(String fn, String ln, String zc, String ei){
        String errors = "";
        if(fn.charAt(0) == '1') {
            errors = errors.concat("The first name must be filled in.\n");
        }if(fn.charAt(1) == '1') {
            errors = errors.concat("The first name must be at least 2 characters long.\n");
        }if(fn.charAt(2) == '1') {
            errors = errors.concat("The first name must only consist of letters.\n");
        }if(ln.charAt(0) == '1') {
            errors = errors.concat("The last name must be filled in.\n");
        }if(ln.charAt(1) == '1') {
            errors = errors.concat("The last name must be at least 2 characters long.\n");
        }if(ln.charAt(2) == '1') {
            errors = errors.concat("The last name must only consist of letters.\n");
        }if(zc.charAt(0) == '1') {
            errors = errors.concat("The zipcode must be a 5 digit number.\n");
        }if(ei.charAt(0) == '1') {
            errors = errors.concat("The employee ID must be in the format of AA-1234.");
        }if((fn.equals("000") && ln.equals("000") && zc.equals("0") && ei.equals("0"))) {
            errors = "There were no errors found.";
        }
        return errors;
    }
}
