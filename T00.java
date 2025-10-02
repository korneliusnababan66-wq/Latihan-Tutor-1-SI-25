import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double bil1, bil2;

        bil1 = Double.parseDouble(input.nextLine());
        bil2 = Double.parseDouble(input.nextLine());
        if (bil1 % 2 == 0) {
            System.out.println("bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: ganjil");
        }
        if (bil2 % 2 == 0) {
            System.out.println("Bilangan kedua: genap");
        } else {
            System.out.println("Bilangan kedua: ganjil ");
        }
        if (bil1 > bil2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (bil1 > bil2) {
                System.out.println("Bilangan kedua pertama besar");
            } else {
                System.out.println("bilangan kedua lebih besar");
            }
        }
        if (bil1 % 2 == 0 && bil2 % 2 == 0) {
            System.out.println("hasil penjumlahan: " + bil1 + bil2);
        } else {
            if (bil1 % 2 == 1 && bil2 % 2 == 1) {
                System.out.println("hasil perkalian: " + bil1 * bil2);
            } else {
                System.out.println("berbeda jenis ");
            }
            System.out.println("terimakasih");
        }
    }
}
