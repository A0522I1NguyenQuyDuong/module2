package ss1_introduction_to_java;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        short num = scanner.nextShort();
        if (num > 999) {
            System.out.println("out of ability!");
        } else if (num >= 0 && num < 10) {
            switch (num) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (num >= 10 && num < 20) {
            int ones = num % 10;
            switch (ones) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        } else if (num >= 20 && num < 100) {
            int ones = num % 10;
            int tens = num / 10;
            if (ones == 0) {
                switch (tens) {
                    case 2:
                        System.out.println("twenty");
                        break;
                    case 3:
                        System.out.println("thirty");
                        break;
                    case 4:
                        System.out.println("fourty");
                        break;
                    case 5:
                        System.out.println("fifty");
                        break;
                    case 6:
                        System.out.println("sixty");
                        break;
                    case 7:
                        System.out.println("seventy");
                        break;
                    case 8:
                        System.out.println("eighty");
                        break;
                    case 9:
                        System.out.println("ninety");
                        break;
                }
            } else {
                switch (tens) {
                    case 2:
                        System.out.println("twenty");
                        break;
                    case 3:
                        System.out.println("thirty");
                        break;
                    case 4:
                        System.out.println("forty");
                        break;
                    case 5:
                        System.out.println("fifty");
                        break;
                    case 6:
                        System.out.println("sixty");
                        break;
                    case 7:
                        System.out.println("seventy");
                        break;
                    case 8:
                        System.out.println("eighty");
                        break;
                    case 9:
                        System.out.println("ninety");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.println(" one");
                        break;
                    case 2:
                        System.out.println(" two");
                        break;
                    case 3:
                        System.out.println(" three");
                        break;
                    case 4:
                        System.out.println(" four");
                        break;
                    case 5:
                        System.out.println(" five");
                        break;
                    case 6:
                        System.out.println(" six");
                        break;
                    case 7:
                        System.out.println(" seven");
                        break;
                    case 8:
                        System.out.println(" eight");
                        break;
                    case 9:
                        System.out.println(" nine");
                        break;
                }
            }
        } else if (num >= 100) {
            int hundreds = num / 100;
            int ones = (num % 100) % 10;
            int tens = (num % 100) / 10;
            if (tens == 0 && ones == 0) {
                switch (hundreds) {
                    case 1:
                        System.out.println("one hundred");
                        break;
                    case 2:
                        System.out.println("two hundred");
                        break;
                    case 3:
                        System.out.println("three hundred");
                        break;
                    case 4:
                        System.out.println("four hundred");
                        break;
                    case 5:
                        System.out.println("five hundred");
                        break;
                    case 6:
                        System.out.println("six hundred");
                        break;
                    case 7:
                        System.out.println("seven hundred");
                        break;
                    case 8:
                        System.out.println("eight hundred");
                        break;
                    case 9:
                        System.out.println("nine hundred");
                        break;
                }
            } else if (tens == 0) {
                switch (hundreds) {
                    case 1:
                        System.out.println("one hundred");
                        break;
                    case 2:
                        System.out.println("two hundred");
                        break;
                    case 3:
                        System.out.println("three hundred");
                        break;
                    case 4:
                        System.out.println("four hundred");
                        break;
                    case 5:
                        System.out.println("five hundred");
                        break;
                    case 6:
                        System.out.println("six hundred");
                        break;
                    case 7:
                        System.out.println("seven hundred");
                        break;
                    case 8:
                        System.out.println("eight hundred");
                        break;
                    case 9:
                        System.out.println("nine hundred");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.println(" and one");
                        break;
                    case 2:
                        System.out.println(" and two");
                        break;
                    case 3:
                        System.out.println(" and three");
                        break;
                    case 4:
                        System.out.println(" and four");
                        break;
                    case 5:
                        System.out.println(" and five");
                        break;
                    case 6:
                        System.out.println(" and six");
                        break;
                    case 7:
                        System.out.println(" and seven");
                        break;
                    case 8:
                        System.out.println(" and eight");
                        break;
                    case 9:
                        System.out.println(" and nine");
                        break;
                }
            } else if (ones == 0) {
                switch (hundreds) {
                    case 1:
                        System.out.println("one hundred");
                        break;
                    case 2:
                        System.out.println("two hundred");
                        break;
                    case 3:
                        System.out.println("three hundred");
                        break;
                    case 4:
                        System.out.println("four hundred");
                        break;
                    case 5:
                        System.out.println("five hundred");
                        break;
                    case 6:
                        System.out.println("six hundred");
                        break;
                    case 7:
                        System.out.println("seven hundred");
                        break;
                    case 8:
                        System.out.println("eight hundred");
                        break;
                    case 9:
                        System.out.println("nine hundred");
                        break;
                }
                switch (tens) {
                    case 1:
                        System.out.println(" and ten");
                        break;
                    case 2:
                        System.out.println(" and twenty");
                        break;
                    case 3:
                        System.out.println(" and thirty");
                        break;
                    case 4:
                        System.out.println(" and forty");
                        break;
                    case 5:
                        System.out.println(" and fifty");
                        break;
                    case 6:
                        System.out.println(" and sixty");
                        break;
                    case 7:
                        System.out.println(" and seventy");
                        break;
                    case 8:
                        System.out.println(" and eighty");
                        break;
                    case 9:
                        System.out.println(" and ninety");
                        break;
                }
            } else if (tens == 1) {
                switch (hundreds) {
                    case 1:
                        System.out.println("one hundred");
                        break;
                    case 2:
                        System.out.println("two hundred");
                        break;
                    case 3:
                        System.out.println("three hundred");
                        break;
                    case 4:
                        System.out.println("four hundred");
                        break;
                    case 5:
                        System.out.println("five hundred");
                        break;
                    case 6:
                        System.out.println("six hundred");
                        break;
                    case 7:
                        System.out.println("seven hundred");
                        break;
                    case 8:
                        System.out.println("eight hundred");
                        break;
                    case 9:
                        System.out.println("nine hundred");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.println(" and eleven");
                        break;
                    case 2:
                        System.out.println(" and twelve");
                        break;
                    case 3:
                        System.out.println(" and thirteen");
                        break;
                    case 4:
                        System.out.println(" and fourteen");
                        break;
                    case 5:
                        System.out.println(" and fifteen");
                        break;
                    case 6:
                        System.out.println(" and sixteen");
                        break;
                    case 7:
                        System.out.println(" and seventeen");
                        break;
                    case 8:
                        System.out.println(" and eighteen");
                        break;
                    case 9:
                        System.out.println(" and nineteen");
                        break;
                }
            } else {
                switch (hundreds) {
                    case 1:
                        System.out.println("one hundred");
                        break;
                    case 2:
                        System.out.println("two hundred");
                        break;
                    case 3:
                        System.out.println("three hundred");
                        break;
                    case 4:
                        System.out.println("four hundred");
                        break;
                    case 5:
                        System.out.println("five hundred");
                        break;
                    case 6:
                        System.out.println("six hundred");
                        break;
                    case 7:
                        System.out.println("seven hundred");
                        break;
                    case 8:
                        System.out.println("eight hundred");
                        break;
                    case 9:
                        System.out.println("nine hundred");
                        break;
                }
                switch (tens) {
                    case 2:
                        System.out.println(" and twenty");
                        break;
                    case 3:
                        System.out.println(" and thirty");
                        break;
                    case 4:
                        System.out.println(" and forty");
                        break;
                    case 5:
                        System.out.println(" and fifty");
                        break;
                    case 6:
                        System.out.println(" and sixty");
                        break;
                    case 7:
                        System.out.println(" and seventy");
                        break;
                    case 8:
                        System.out.println(" and eighty");
                        break;
                    case 9:
                        System.out.println(" and ninety");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.println(" one");
                        break;
                    case 2:
                        System.out.println(" two");
                        break;
                    case 3:
                        System.out.println(" three");
                        break;
                    case 4:
                        System.out.println(" four");
                        break;
                    case 5:
                        System.out.println(" five");
                        break;
                    case 6:
                        System.out.println(" six");
                        break;
                    case 7:
                        System.out.println(" seven");
                        break;
                    case 8:
                        System.out.println(" eight");
                        break;
                    case 9:
                        System.out.println(" nine");
                        break;
                }
            }
        }
    }
}
