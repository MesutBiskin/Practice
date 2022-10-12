package Emir_Practice;

public class QuestionSets {
    public static void main(String[] args) {

//        swapNumbersWithoutTemp(10, 15);

//        System.out.println(LeapYear(1995));
//        writeNumbers();
//        System.out.println(sumOfNumbers());
        System.out.println(findFactorial(6));
        System.out.println(findFactorial(9));
        System.out.println(findFactorial(12));
    }

    public static void swapNumbersWithoutTemp(int a, int b) {
        System.out.println("degisim Oncesi");

        int temp = a;
        a = b;
        b = temp;
        System.out.println("sonraki degissin");
        System.out.println("a=" + a + " " + "b=" + b);

        System.out.println("degisim sonrasi");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " " + "b=" + b);

    }

    int yil = 1995;

    //write a java program to check if given year is leap or not
    public static boolean LeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {

            return true;
        } else if (year % 400 == 0) {
            return true;
        }
        return false;
    }

//    Write a program to print numbers from 1 to 10

    public static void writeNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
//  write a program to calculate the sum of first 10 naturel number.


        public static int sumOfNumbers() {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            return sum;
        }
        public static int findFactorial(int input){

        int result=1;
        for (int i =input;i>0; i--){
            result=result*i;

        }
        return result;
    }


}







