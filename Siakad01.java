import java.util.Scanner;

public class Siakad01 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String nama, nim ; 
      char kelas; 
      byte absen; 
      double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUAS, nilaiAkhir;
      String nilaiKualifikasi;

      System.out.print("Masukan nama: "); 
      nama = sc.nextLine(); 
      System.out.print("Masukan NIM: "); 
      nim = sc.nextLine(); 
      System.out.print("Masukan kelas: "); 
      kelas = sc.nextLine(). charAt(0); 
      System.out.print("Masukan nomer absen: "); 
      absen = sc.nextByte(); 

      System.out.print("Masukan nilai kuis: "); 
      nilaiKuis = sc.nextDouble(); 
      System.out.print("Masukan nilai tugas: "); 
      nilaiTugas = sc.nextDouble(); 
      System.out.print("Masukan nilai ujian: "); 
      nilaiUjian = sc.nextDouble(); 
      System.out.print("Masukan nilai UAS: "); 
      nilaiUAS = sc.nextDouble(); 

      nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUjian * 0.30) + (nilaiUAS * 0.35) ; 

  
      System.out.println("Mahasiswa degan Nama " + nama + " ( NIM " + nim + ")" +  " Kelas " + kelas + " Nomor absen " + absen); 
      System.out.println("Nilai Akhir: " + nilaiAkhir); 
      

      if (nilaiAkhir >= 80 && nilaiAkhir <=100) {
        System.out.println("nilai akhir huruf: A");
        System.out.println("kualifikasi: sangat baik");
      }
      if (nilaiAkhir >= 73 && nilaiAkhir <=80) {
        System.out.println("nilai akhir huruf: B+");
        System.out.println("kualifikasi: lebih dari baik");
      }
      if (nilaiAkhir >= 65 && nilaiAkhir <=73) {
        System.out.println("nilai akhir huruf: B");
        System.out.println("kualifikasi: Baik");
      }
      if (nilaiAkhir >= 60 && nilaiAkhir <=65) {
        System.out.println("nilai akhir huruf: C+");
        System.out.println("kualifikasi: Lebih dari cukup");
      }
      if (nilaiAkhir >= 50 && nilaiAkhir <=60) {
        System.out.println("nilai akhir huruf: C");
        System.out.println("kualifikasi: Cukup");
      }
      if (nilaiAkhir >= 39 && nilaiAkhir <=50) {
        System.out.println("nilai akhir huruf: D");
        System.out.println("kualifikasi: Kurang");
      }
      if ( nilaiAkhir <=39) {
        System.out.println("nilai akhir huruf: E");
        System.out.println("kualifikasi: Gagal");
      }

      
      

    }
}
