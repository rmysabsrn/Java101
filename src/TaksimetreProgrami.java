import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20;
        double total;
        double startPrice=10;


        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi km cinsinden giriniz : ");
        km = input.nextInt();


        total = (km*perKm)+startPrice;

        total = (total < 20 ) ? 20 : total ;

        System.out.println("Toplam tutar : "+ total);



    }
}

