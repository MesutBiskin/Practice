import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        //   soru ;     bir java programi yazin bir sayinin basamaklari toplamini bulsun

     Scanner sayi = new Scanner(System.in);
        System.out.println("Bir Sayi Gir");

        int num = sayi.nextInt();
        int adet = 0,toplam=0;

        while(num != 0)
        {
            toplam=(num%10)+toplam;
            num /= 10;
            ++adet;
        }

        System.out.println("Basamak Toplamı: " + toplam);



    }
}
