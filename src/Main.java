import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Konstanta untuk konversi dari byte ke kilobyte
    final double SATU_KB = 1024.0;

    //Input nama file
    System.out.print ("Nama fie     :");
    String namaFile = scanner.nextLine();

    //Input ukuran file dalam byte
    System.out.print("Ukuran (byte)  :");

    //Percobaan menggunakan int:
    //int ukuranByte = 322225472;
    //error:  integer number too large karena 322122572 melebihi batas maksismum int.

        // 1024.0 digunakan agar pembagian menghasilkan nilai double dan pecahan tidak hilang.
        double ukuranKB = ukuranByte / SATU_KB;

        // Konversi dari KB ke MB
        double ukuranMB = ukuranKB / SATU_KB;

        // Konversi dari MB ke GB
        double ukuranGB = ukuranMB / SATU_KB;

        // Konversi double ke int secara eksplisit.
        // Bagian pecahan akan hilang karena int hanya menyimpan bilangan bulat.
        int ukuranMBBulat = (int) ukuranMB;

        // Menghitung selisih antara ukuran MB asli dengan MB yang sudah dibulatkan.
        double selisihPembulatan = ukuranMB - ukuranMBBulat;



