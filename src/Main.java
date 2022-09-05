import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluştur.
        int mat, fizik, kimya, turkce , tarih, muzik;

        //Scanner sınıfını tanımla.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri al.
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.println(mat);

        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();
        System.out.println(fizik);

        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();
        System.out.println(kimya);

        System.out.println("Türkçe notunuz : ");
        turkce = input.nextInt();
        System.out.println(turkce);

        System.out.println("Tarih notunuz : ");
        tarih = input.nextInt();
        System.out.println(tarih);

        System.out.println("Müzik notunuz : ");
        muzik = input.nextInt();
        System.out.println(muzik);

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : "+ sonuc);



        String durum = (sonuc >= 60) ? "Geçtiniz": "Kaldınız";

        System.out.println("Başarı Durumunuz :"+ durum);


    }
}
