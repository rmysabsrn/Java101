import java.util.Scanner;

public class ManavKasaProg {
    public static void main(String[] args) {
        /*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran
        programı yazın.

        Meyveler ve KG Fiyatları
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL */


        Scanner input = new Scanner(System.in);

        double perKgArmut = 2.14,perKgElma = 3.67,perKgDomat = 1.11,perKgMuz = 0.95,perKgPat = 5.00;
        double toplamTutar;


        System.out.print("Kaç kilo Armut : ");
        double armut = input.nextDouble();


        System.out.print("Kaç kilo Elma : ");
        double elma = input.nextDouble();

        System.out.print("Kaç kilo Domates : ");
        double domates = input.nextDouble();

        System.out.print("Kaç kilo Muz : ");
        double muz = input.nextDouble();

        System.out.print("Kaç kilo Patlıcan : ");
        double pat = input.nextDouble();

        toplamTutar = (armut*perKgArmut)+(elma*perKgElma)+(domates*perKgDomat)+(muz*perKgMuz)+(pat*perKgPat);
        System.out.println("Toplam Tutarınız : "+ toplamTutar+" TL");





    }
}
