import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите 2  целых числа: ");

        Scanner sc = new Scanner(System.in);

        String[] inp = sc.nextLine().split(" ");
        String num1 = inp[0];
        String num2 = inp[2];

        int num1Res = 0;
        int num2Res = 0;


        if (num1.matches("[-+]?\\d+") && num1.matches("[-+]?\\d+")){
            try {
                num1Res = Integer.parseInt(num1);
            } catch (NumberFormatException e) {

                System.out.println("not int format!");
                System.exit(0);
            }

            try {
                num2Res = Integer.parseInt(num2);
            } catch (NumberFormatException e) {

                System.out.println("not int format!");
                System.exit(0);
            }

            if (num2Res > 0 && num2Res <= 10 && num1Res > 0 && num1Res <= 10 ) {
                switch (inp[1]) {
                    case "+" -> System.out.println(num1Res + num2Res);
                    case "-" -> System.out.println(num1Res - num2Res);
                    case "*" -> System.out.println(num1Res * num2Res);
                    case "/" -> System.out.println(num1Res / num2Res);
                    default -> System.out.println("error!");
                }

            } else {
                System.out.println("big number!");
            }

        } else if ((num1.equals("I") || num1.equals("II") || num1.equals("III") || num1.equals("IV")
                || num1.equals("V") || num1.equals("VI") || num1.equals("VII") || num1.equals("VIII")
                || num1.equals("IX") || num1.equals("X")) && (num2.equals("I") || num2.equals("II")
                || num2.equals("III") || num2.equals("IV") || num2.equals("V") || num2.equals("VI")
                || num2.equals("VII") || num2.equals("VIII") || num2.equals("IX") || num2.equals("X"))){


            String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
            };

            switch (num1) {
                case ("I") -> num1Res = 1;
                case ("II") -> num1Res = 2;
                case ("III") -> num1Res = 3;
                case ("IV") -> num1Res = 4;
                case ("V") -> num1Res = 5;
                case ("VI") -> num1Res = 6;
                case ("VII") -> num1Res = 7;
                case ("VIII") -> num1Res = 8;
                case ("IX") -> num1Res = 9;
                case ("X") -> num1Res = 10;
                default -> System.out.println("error!");
            }

            switch (num2) {
                case ("I") -> num2Res = 1;
                case ("II") -> num2Res = 2;
                case ("III") -> num2Res = 3;
                case ("IV") -> num2Res = 4;
                case ("V") -> num2Res = 5;
                case ("VI") -> num2Res = 6;
                case ("VII") -> num2Res = 7;
                case ("VIII") -> num2Res = 8;
                case ("IX") -> num2Res = 9;
                case ("X") -> num2Res = 10;
                default -> System.out.println("error!");
            }
            int res;


            if (num2Res > 0 && num2Res <= 10 && num1Res > 0 && num1Res <= 10 ) {
                if ("+".equals(inp[1])) {
                    res = num1Res + num2Res;
                    System.out.println(roman[res]);
                } else if ("-".equals(inp[1])) {
                    res = num1Res - num2Res;
                    if (res > 0) {
                        System.out.println(roman[res]);
                    }else{
                        System.out.println("error!");
                    }
                } else if ("*".equals(inp[1])) {
                    res = num1Res * num2Res;
                    System.out.println(roman[res]);
                } else if ("/".equals(inp[1])) {
                    res = num1Res / num2Res;
                    System.out.println(roman[res]);
                } else {
                    System.out.println("error!");
                }

            } else {
                System.out.println("big number!");
            }


        } else {
            System.out.println("error");
            System.exit(0);
        }


    }




}
