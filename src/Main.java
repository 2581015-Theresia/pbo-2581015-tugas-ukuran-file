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



