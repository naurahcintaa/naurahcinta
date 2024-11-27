package LatihanUKL;

import java.util.Scanner;

public class LatihanMethod {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        int bilangan = 0;
        System.out.println("---Menentukan bilangan Prima---");
        System.out.println("Masukkan angka: ");
        bilangan = c.nextInt();
        cekPrima(bilangan);

    }

    public static void cekPrima(int angka){
        boolean prima = true;
        for (int i = 2; i <= angka/2; i++) {
            if (angka % i == 0) {
                prima = false;
                break;
            }
        }

        if (prima) {
            System.out.println("" + angka + " adalah bilangan prima");
        }else{
            System.out.println("" + angka + "bukan bilangan prima");
        }
    }
}
