package Emir_Practice;

public class cozum_2 {
    public static void main(String[] args) {
        int sayi = 152;
        int toplam = 0;

        while (sayi > 0) {
            toplam = toplam + sayi % 10;
            sayi = sayi / 10;

        }
        System.out.println(toplam);
    }
}