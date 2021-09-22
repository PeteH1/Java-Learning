package com.qa.day2;

public class ConvertToString {
    public String Convert(int num) {
        if(num < 1 || num > 9999) {
            return "please enter a number between 1 and 10000";
        } else {
            String units = units(num);
            String tens = tens(num);
            String teens = teens(num);
            String hundreds = hundred(num);
            String thousands = thousand(num);
            if(thousands == "") {
                if(hundreds == "") {
                    if(tens == "") {
                        return units;
                    }
                    if(teens != "") {
                        return teens;
                    }
                    return tens + " " + units;
                }
                if(teens != "") {
                    return hundreds + " and "+ teens;
                }
                return hundreds +  " and " + tens + " " + units;
            } else {
                if(teens != "") {
                    return thousands + " " + hundreds + " and " + teens;
                }
                return thousands + " " + hundreds +  " and " + tens + " " + units;
            }
        }
    }
    private String units(int input) {
        String units = "";
        switch(input % 10) {
        case 1:
            units = "One";
            break;
        case 2:
            units = "Two";
            break;
        case 3:
            units= "Three";
            break;
        case 4:
            units= "Four";
            break;
        case 5:
            units= "Five";
            break;
        case 6:
            units= "Six";
            break;
        case 7:
            units= "Seven";
            break;
        case 8:
            units= "Eight";
            break;
        case 9:
            units= "Nine";
            break;
        default:
            units = "";
            break;
        }
        return units;
    }
    private String tens(int input) {
        String tens = "";
        switch(input / 10 % 10) {
        case 1:
            tens = "Ten";
            break;
        case 2:
            tens = "Twenty";
            break;
        case 3:
            tens= "Thirty";
            break;
        case 4:
            tens= "Fourty";
            break;
        case 5:
            tens= "Fifty";
            break;
        case 6:
            tens= "Sixty";
            break;
        case 7:
            tens= "Seventy";
            break;
        case 8:
            tens= "Eighty";
            break;
        case 9:
            tens= "Ninety";
            break;
        default:
            tens = "";
            break;
        }
        return tens;
    }
    private String teens(int input) {
        String teens = "";
        String tens = tens(input);
        String units = units(input);
        if(tens == "Ten" && units != "") {
            switch(units) {
            case "One":
                teens = "Eleven";
                break;
            case "Two":
                teens = "Twelve";
                break;
            case "Three":
                teens = "Thirteen";
                break;
            case "Four":
                teens = "Fourteen";
                break;
            case "Five":
                teens = "Fifteen";
                break;
            case "Six":
                teens = "Sixteen";
                break;
            case "Seven":
                teens = "Seventeen";
                break;
            case "Eight":
                teens = "Eighteen";
                break;
            case "Nine":
                teens = "Nineteen";
                break;
            default:
                teens = "";
                break;
            }
        }
        return teens;
    }
    private String hundred(int input) {
        String hundred = "";
        switch(input / 100 % 10) {
        case 1:
            hundred = "One hundred";
            break;
        case 2:
            hundred = "Two hundred";
            break;
        case 3:
            hundred = "Three hundred";
            break;
        case 4:
            hundred = "Four hundred";
            break;
        case 5:
            hundred = "Five hundred";
            break;
        case 6:
            hundred = "Six hundred";
            break;
        case 7:
            hundred = "Seven hundred";
            break;
        case 8:
            hundred = "Eight hundred";
            break;
        case 9:
            hundred = "Nine hundred";
            break;
        default:
            hundred = "";
            break;
        }
        return hundred;
    }
    private String thousand(int input) {
        String thousand = "";
        switch(input / 1000 % 10) {
        case 1:
            thousand = "One thousand";
            break;
        case 2:
            thousand = "Two thousand";
            break;
        case 3:
            thousand = "Three thousand";
            break;
        case 4:
            thousand = "Four thousand";
            break;
        case 5:
            thousand = "Five thousand";
            break;
        case 6:
            thousand = "Six thousand";
            break;
        case 7:
            thousand = "Seven thousand";
            break;
        case 8:
            thousand = "Eight thousand";
            break;
        case 9:
            thousand = "Nine thousand";
            break;
        default:
            thousand = "";
            break;
        }
        return thousand;
    }
}