import java.util.Scanner;

public class PemilihanBilangan01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        String hasil;

        System.out.print("Masukan sebuah angka: ");
        angka = sc.nextInt();
         
        hasil = (angka % 2 == 0) ? " termasuk bilangan ganjil" : "termasuk bilangan genap";
        
        
           System.out.println(angka + " adalah  " + hasil);

        
}
}