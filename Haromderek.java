/*
* File: Haromderek.java
* Author: Balogh Csenge
* Copyright: 2022, Balogh Csenge
* Group: Szoft_I_N
* Date: 2022-02-16
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class Haromderek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Balogh Csenge, Szoft_I_N, 2022.02.16");
        System.out.println("Haromszogvizsgalo");

        System.out.print("A oldal > ");
        double a = sc.nextDouble();
        System.out.print("B oldal > ");
        double b = sc.nextDouble();
        System.out.print("C oldal > ");
        double c = sc.nextDouble();

        sc.close();

        if (
            a + b > c &&
            a + c > b &&
            b + c > a
        ) {
            System.out.println("A haromszog szerkesztheto.");
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                System.out.println("A haromszog derekszogu.");
            }
        } else {
            System.out.println("A haromszog nem letezik.");
        }
    }
}