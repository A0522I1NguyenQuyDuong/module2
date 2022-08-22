package ss1_introduction_to_java;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("Nhập a,b,c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        ss1_introduction_to_java.QuadraticEquation qe = new ss1_introduction_to_java.QuadraticEquation(a, b, c);
        if (qe.getDiscriminant()<0){
            System.out.println("Phương trình không có nghiệm nguyên");
        } else if (qe.getDiscriminant()==0) {
            System.out.println("Phương trình có nghiệm nguyên: " + qe.getRoot1());
        }else
                System.out.println("Phương trình có 2 nghiệm:");
                System.out.println("Denta là : " +qe.getDiscriminant());
                System.out.println("Nghiệm1:" +qe.getRoot1());
                System.out.println("Nghiệm 2:" +qe.getRoot2());
            }
            
        }
