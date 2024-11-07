import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String nama, next, menu;
        int baris, kolom;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("Menu :\n 1. Tambah Penonton\n 2. Tampilkan Daftar Penonton\n 3. Exit");
            System.out.print("Pilih menu : ");
            menu = sc2.nextLine();
            if(menu.equalsIgnoreCase("1") || menu.equalsIgnoreCase("tambah penonto")){
                while (true) {
                    System.out.print("Masukkan nama : ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        
                        // handle alert kursi penonton yang penuh
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Silakan coba lagi.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                        } else {
                            break;
                        }
                    }

                    penonton[baris-1][kolom-1] = nama;

                    System.out.println("Input penonton lainnya ? y/n");
                    next = sc.nextLine();

                    if(next.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }else if(menu.equalsIgnoreCase("2") || menu.equalsIgnoreCase("tampilkam daftar penonton")){
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        // handle jika kursi penonton kosong dan diganti dengan **
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            }else if(menu.equalsIgnoreCase("3") || menu.equalsIgnoreCase("exit")){
                System.out.println("Terima kasih! Program selesai.");
                return;
            }else{
                System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
        

    }
}
