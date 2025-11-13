/*
 * Ad Soyad: Muhammed AHMED
 * Ogrenci No: 25051604
 * Tarih: [TARIHI BURAYA YAZIN]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    // Sabit: Yerçekimi ivmesi
    final static double GRAVITY = 9.8; // m/s²

    // METOT 1: Hız hesapla (v = s / t)
    public static double calculateVelocity(double s, double t) {
        return s / t;
    }

    // METOT 2: İvme hesapla (a = Δv / t)
    public static double calculateAcceleration(double deltaV, double t) {
        return deltaV / t;
    }

    // METOT 3: Kuvvet hesapla (F = m * a)
    public static double calculateForce(double m, double a) {
        return m * a;
    }

    // METOT 4: İş hesapla (W = F * d)
    public static double calculateWork(double f, double d) {
        return f * d;
    }

    // METOT 5: Güç hesapla (P = W / t)
    public static double calculatePower(double w, double t) {
        return w / t;
    }

    // METOT 6: Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double m, double v) {
        return 0.5 * m * Math.pow(v, 2);
    }

    // METOT 7: Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double m, double g, double h) {
        return m * g * h;
    }

    // METOT 8: Momentum (p = m * v)
    public static double calculateMomentum(double m, double v) {
        return m * v;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== FIZIK FORMUL ASISTANI ===");
        System.out.println();

        // TEMEL ÖLÇÜMLER
        System.out.println("TEMEL OLCUMLER:");
        System.out.print("Kutle (kg): ");
        double kutle = input.nextDouble();

        System.out.print("Mesafe (m): ");
        double mesafe = input.nextDouble();

        System.out.print("Zaman (s): ");
        double zaman = input.nextDouble();

        System.out.print("Hiz degisimi (m/s): ");
        double deltaV = input.nextDouble();

        System.out.print("Yukseklik (m): ");
        double yukseklik = input.nextDouble();

        // HESAPLAMALAR
        double hiz = calculateVelocity(mesafe, zaman);
        double ivme = calculateAcceleration(deltaV, zaman);
        double kuvvet = calculateForce(kutle, ivme);
        double isDegeri = calculateWork(kuvvet, mesafe);
        double guc = calculatePower(isDegeri, zaman);
        double kinetikEnerji = calculateKineticEnergy(kutle, hiz);
        double potansiyelEnerji = calculatePotentialEnergy(kutle, GRAVITY, yukseklik);
        double momentum = calculateMomentum(kutle, hiz);

        // SONUÇLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", hiz);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", ivme);

        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", kuvvet);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", isDegeri);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", guc);

        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kinetikEnerji);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potansiyelEnerji);
        System.out.printf("  Toplam Enerji             : %.2f J\n", (kinetikEnerji + potansiyelEnerji));

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");

        input.close();
    }
}
