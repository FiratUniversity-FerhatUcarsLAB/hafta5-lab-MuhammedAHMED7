/*250541604
Muhammed AHMED
13.11.2025
Gorev 1 - Geometrik Sekil Hesaplayici
 *
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */
import java.util.Scanner;

public class GeometrikHesap {
    //kare alanı
    public static double calculateSquareArea(double kenar) {
        return kenar*kenar;
}
    //kare çevresi
        public static double calculateSquarePerimeter(double kenar){
        return kenar*4;
    }
    //daire alanı
    public static double calculateCircleArea(double r) {
        return Math.PI*Math.pow(r,2);
    }
    //daire cevresi
    public static double calculateCircumCircleference(double r) {
        return 2*Math.PI*r;
    }
    //Dikdörtgen alanı
    public static double calculateRectangleArea(double kisaKenar, double uzunKenar) {
        return kisaKenar*uzunKenar;
    }
    //Dikdörtgen cevresi
    public static double calculateRectanglePerimeter(double kisaKenar, double uzunKenar){
        return 2*(kisaKenar+uzunKenar);
    }
    //uçgen alanı
    public static double calculateTraingleArea(double taban,double yukseklik) {
        return (taban*yukseklik)/2;
    }
    //ucgen cevresi
    public static double calculateTrainglePerimeter(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("GEOMETRIK HESAP");
        System.out.println("=======================");

        System.out.println("KARE");
        System.out.print("Kenar uzunlugu (cm): ");
        double kenar= scan.nextDouble();
        System.out.printf("\tAlan :%.2f\n",calculateSquareArea(kenar));
        System.out.printf("\tÇevre :%.1f\n",calculateSquarePerimeter( kenar));

        System.out.println("\nDAİRE");
        System.out.print("r :");
        double r=scan.nextDouble();
        System.out.printf("\tAlan :%.2f\n",calculateCircleArea(r));
        System.out.printf("\tÇevre :%.2f\n",calculateCircumCircleference(r));

        System.out.println("\nDİKDÖRTGEN");
        System.out.print("Kısa Kenar :");
        double kisaKenar= scan.nextDouble();
        System.out.print("Uzun Kenar :");
        double uzunKenar= scan.nextDouble();
        System.out.printf("\tAlan :%.2f\n",calculateRectangleArea (kisaKenar,uzunKenar));
        System.out.printf("\tÇevre :%.2f\n",calculateRectanglePerimeter(kisaKenar,uzunKenar));

        System.out.println("UÇGEN");
        System.out.print("Yükseklik :");
        double yukseklik= scan.nextDouble();
        System.out.print("Taban :");
        double taban= scan.nextDouble();
        System.out.printf("\tAlan :%.2f\n",calculateTraingleArea (yukseklik,taban));
        System.out.print("kenar1 :");
        double a= scan.nextDouble();
        System.out.print("kenar2:");
        double b= scan.nextDouble();
        System.out.print("kenar3:");
        double c= scan.nextDouble();
        System.out.printf("\tÇevre :%.2f\n",calculateTrainglePerimeter(a,b,c));
        scan.close();

    }
}
