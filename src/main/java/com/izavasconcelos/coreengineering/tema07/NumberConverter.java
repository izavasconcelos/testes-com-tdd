package com.izavasconcelos.coreengineering.tema07;

public class NumberConverter {
    private static final String[] ROMAN = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};

    public int romanToInteger(String romanNumber) {
        romanNumber = romanNumber.toUpperCase();

        int integerNumber = 0;
        if(romanNumberIsValid(romanNumber)) {
            for (int i = 0; i < romanNumber.length(); i++) {
                switch (romanNumber.charAt(i)) {
                    case 'I':
                        integerNumber += 1;
                        break;
                    case 'V':
                        if (integerNumber == 0 || integerNumber == 10) {
                            integerNumber += 5;
                        } else {
                            integerNumber += 3;
                        }
                        break;
                    case 'X':
                        if (integerNumber == 0 || integerNumber == 10) {
                            integerNumber += 10;
                        } else {
                            integerNumber += 8;
                        }
                        break;
                }

            }
            return integerNumber;
        }
        return 0;
    }

    public String integerToRoman(int integerNumber) {
        StringBuilder romanNumber = new StringBuilder();
        if(integerNumberIsValid(integerNumber)){
            while(integerNumber > 0){
                if(integerNumber >= 10){
                    romanNumber.append("X");
                    integerNumber -= 10;
                } else if(integerNumber == 9){
                    romanNumber.append("IX");
                    integerNumber = 0;
                } else if (integerNumber > 5) {
                    romanNumber.append("VI");
                    integerNumber -= 6;
                } else if(integerNumber == 5){
                    romanNumber.append("V");
                    integerNumber -= 5;
                } else if(integerNumber == 4){
                    romanNumber.append("IV");
                    integerNumber -= 4;
                } else {
                    romanNumber.append("I");
                    integerNumber --;
                }
            }
            return romanNumber.toString();
        }
        return romanNumber.toString();
    }

    public boolean romanNumberIsValid(String romanNumber){
        if(romanNumber != null) {
            romanNumber = romanNumber.toUpperCase();
            for (String isARomanValid : ROMAN){
                if (isARomanValid.equals(romanNumber)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean integerNumberIsValid(int intNumber){
        return intNumber >= 1 && intNumber <= 20;
    }

}
