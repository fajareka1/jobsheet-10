import java.util.Scanner;

public class SIAKAD04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mahasiswa, matkul;
        double totalPerSiswa = 0, totalperMatkul = 0;

        System.out.print("Masukkan jumlah Mahasiswa : ");
        mahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah : ");
        matkul = sc.nextInt();

        int[][] nilai = new int[mahasiswa][matkul];

        for (int i = 0; i < nilai.length; i++){
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++){
                System.out.print("Nilai mata kuliah " + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata per siswa : " + totalPerSiswa/nilai[i].length);
        }

        for (int j = 0; j < matkul; j++){
            totalperMatkul = 0;
            for (int i = 0; i < mahasiswa; i++){
                totalperMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + " : " + totalperMatkul/mahasiswa);
        }
    }
}
