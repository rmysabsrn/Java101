import java.util.Scanner;
public class AlanHesaplama {
    public static void main(String[] args) {
        int a,b,c;
        int u;
        int alan;

        Scanner input= new Scanner(System.in);
        System.out.print("a sayısını giriniz : ");
        a = input.nextInt();

        System.out.print("b sayısını giriniz : ");
        b = input.nextInt();

        System.out.print("c sayısını giriniz : ");
        c = input.nextInt();


        u = (a+b+c)/2;
        alan = (int)  Math.sqrt(u * (u-a)* (u-b) * (u-c));
        System.out.println("Üçgenin alanı : " + alan);
    }
}
