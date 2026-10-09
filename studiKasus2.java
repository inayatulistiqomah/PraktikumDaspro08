import java.util.Scanner;
public class studiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        String jenis = sc.nextLine();

        String pesan;

        if (jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = sc.nextInt();

            if (dokumen == 4) {
                if (juara >= 1 && juara <= 3) {
                    pesan = "Dokumen lengkap dan juara " +juara +". Dana penghargaan diberikan.";
                } else {
                    pesan = "Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.";
                }
            } else {
                pesan = "Dokumen tidak lengkap (kurang " +(4 - dokumen) +" dokumen). Dana penghargaan tidak diberikan.";
            }
        } else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int lolos = sc.nextInt();

            if (dokumen == 4) {
                if (lolos == 1) {
                    pesan = "Dokumen lengkap dan lolos pendanaan PKM. Dana penghargaan diberikan";
              } else {
                  pesan = "Tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.";
              }
             } else {
                  pesan = "Dokumen tidak lengkap (kurang " +(4 - dokumen) +" dokumen). Dana penghargaan tidak diberikan.";
             }
        } else {
            pesan = "Kegiatan lainnya tidak memperoleh dana penghargaan";
        }
        System.out.print("Status : " +pesan);
        sc.close();
    } 
}
