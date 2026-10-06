import java.util.Scanner;
public class studiKasus1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup\t : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar\t : ");
        uangBayar = sc.nextInt();

        
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            totalBayar = totalHarga - diskon;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total harga\t\t : " +totalHarga);
        System.out.println("Diskon\t\t\t : " +diskon);
        System.out.println("Total bayar\t\t : " +totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian : " +kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" +kurang);
        }
    }
}