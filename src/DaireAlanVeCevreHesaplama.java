import java.util.Scanner;

public class DaireAlanVeCevreHesaplama {
    public static void main(String[] args) {
       // Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
       // 𝜋 sayısını = 3.14 alınız.
        //       Formül : (𝜋 * (r*r) * 𝛼) / 360


       int r,aci;
       double pi= 3.14;
       double alan;
       double cevre;

        Scanner input = new Scanner(System.in);
        System.out.print("Daire yarıçapını giriniz: ");
        r= input.nextInt();

        System.out.print("Kaç derecelik bir açının alanını bulmak istersiniz: ");
        aci = input.nextInt();


        cevre = (2*pi*r)*aci/360;
        alan = (pi*r*r)*aci/360;

        System.out.println("Dairenizin alanı : "+alan);
        System.out.println("Dairenizin çevresi : "+ cevre);






    }
}
