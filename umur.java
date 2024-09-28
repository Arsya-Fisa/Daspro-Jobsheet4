import java.util.Scanner;

public class umur {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukan umur anda: ");
        int usia = sc.nextInt();

        if (usia >= 0) 
        if (usia <= 12) {
            System.out.println("Kategori: Anak");    
        } 
        else if (usia <= 19) {
            System.out.println("Kategori: Remaja");
        }
        else if (usia <= 64) {
            System.out.println("Katergori: Dewasa");
        }
        else {
            System.out.println("Kategori: Lansia");
        }
          else {
            System.out.println("Tidak Valid: Angka harus positif");
        }
          
        
    }
    }