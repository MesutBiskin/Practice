package Emir_Practice;

import java.util.Scanner;

public class Day01_Practice {
    public static void main(String[] args) {
// soru : Iki degisken alin bunlari a nin kini b ye ata ,  b`nin degerini a`ya ata ve bunu consolda cikti al.

        int a = 3;
        int b = 5;
        System.out.println("Onceki numara");
        System.out.println("a=" + b);
        System.out.println("b=" + b);


        int temp = a;
        a = b;
        b = temp;
        System.out.println("sonraki degissin");
        System.out.println("a=" + a);
        System.out.println("b=" + b);


//        bu degiskenleri ilk degerlerine dondur.
        System.out.println("Ikinci cozum yolu degiskenlerin ilk degerlerine donusumu");

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " " + "b=" + b);

//      SAYIYI ARTTIRMA VE EKSILTME (post Increment , pre increment )
//        a++ , b-- , --a , --b
//      auto widening + otomatik genisletme
//        explicit  narrowing
        //       math operators
//


//   soru ;     bir java programi yazin bir sayinin basamaklari toplamini bulsun

//        WRAPPER CLASSES

//        CONCILIATION
//        RELATIONAL OPERATORS " == <>  <= => !=
//        LOGIC OPERATORS && ||
//        IF STATEMENT
 /*       if (sayi > aasdf){
            System.out.println("birincisi ikincisinden daha buyuk");
        }else if (sayi< aasdf){
            System.out.println("degil");
        }else{
            System.out.println("esit");
        }

  */

//  TERNARY OPERATORS
   /*     if (sayi> aasdf){
            System.out.println("buyuk");
        }else{
            System.out.println("kucuk");
        }

            int degisken;
        Scanner scan = new Scanner(System.in);
        int birinciSayi = scan.nextInt();
        int ikinciSayi = scan.nextInt();
        degisken = birinciSayi>ikinciSayi ? birinciSayi : ikinciSayi ;
        if (birinciSayi > ikinciSayi){
            degisken= birinciSayi;

        }else{
            degisken = ikinciSayi;
        }
        System.out.println(degisken);

*/

    }
}