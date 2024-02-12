package shapeProject;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int secim;
        do {
            System.out.println("********Islemler*********");
            System.out.println("Secmek istediginiz sekli ve islemi seciniz");
            System.out.println("1.Kare");
            System.out.println("2.Dikdörtgen");
            System.out.println("3.Daire");
            System.out.println("4.Ücgen");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Kenar uzunlugu giriniz=");
                    Kare kare = new Kare(scanner.nextDouble());
                    System.out.println("Kare alani=" + kare.alanHesapla());
                    System.out.println("Kare cevresi=" + kare.cevreHesapla());
                    break;
                case 2:
                    System.out.print("Uzun kenar giriniz");
                    double uzunKenar = scanner.nextDouble();
                    System.out.print("Kisa kenari giriniz");
                    double kisaKenar = scanner.nextDouble();
                    Dikdortgen d1 = new Dikdortgen(uzunKenar, kisaKenar);
                    System.out.println("Dikdörtgen alani=" + d1.alanHesapla());
                    System.out.println("Dikdörtgen cevresi=" + d1.cevreHesapla());
                    break;
                case 3:
                    System.out.print("Yaricapi giriniz");
                    double yaricapi = scanner.nextDouble();
                    Daire daire = new Daire(yaricapi);
                    System.out.println("Daire alani=" + daire.alanHesapla());
                    System.out.println("Daire cevresi=" + daire.cevreHesapla());
                    break;
                case 4:
                    System.out.print("Birinci Kenar uzunlugu giriniz=");
                    double kenar1 = scanner.nextDouble();
                    System.out.print("Ikinci Kenar uzunlugu giriniz=");
                    double kenar2 = scanner.nextDouble();
                    System.out.print("Ücüncü Kenar uzunlugu giriniz=");
                    double kenar3 = scanner.nextDouble();
                    Ucgen ucgen = new Ucgen(kenar1, kenar2, kenar3);
                    System.out.println("Ücgen alani=" + ucgen.alanHesapla());
                    System.out.println("Ücgen cevresi=" + ucgen.cevreHesapla());
                    break;
            }
        } while (secim != 0);
    }
}