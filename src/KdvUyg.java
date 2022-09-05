import java.util.Scanner;

public class KdvUyg {
    public static void main(String[] args) {
        double deger;
        double kdvOrani= 0.18 ;
        double kdvTutari;
        double kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat tutarını giriniz: ");
        deger = input.nextDouble();

        System.out.println("KDV Oranınız: " + kdvOrani);

        kdvTutari = deger*kdvOrani;
        System.out.println("Kdv Tutarınız: " + kdvTutari);

        kdvliTutar = deger+kdvTutari;
        System.out.println("Kdvli Tutarınız: " + kdvliTutar);

    }

}
