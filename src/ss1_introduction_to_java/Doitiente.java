package ss1_introduction_to_java;

import java.util.Scanner;

public class Doitiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số USD");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Gía trị vnd:" + quydoi);
        }
    }
