import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {


        double boy,kilo,vke;


        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo = input.nextDouble();

        vke = kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz : " + vke);




    }




}
