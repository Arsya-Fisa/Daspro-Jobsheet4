import java.util.Scanner;

public class PemilihanHaridenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number, dayType;

        System.out.println("Input number: ");
        int angka = sc.nextInt();

        if (angka >=1 && angka <=5) {
            System.out.println("weekday");
        }
        else if(angka ==6 && angka ==7){
            System.out.println("weekend");
        }
        else {
            System.out.println("number tidak valid");
        }

    }


}
