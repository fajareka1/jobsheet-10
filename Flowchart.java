import java.util.Scanner;

public class Flowchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6];

        int nilai, jumlah = 0;

        for (int i = 0; i < survei.length; i++){
            System.out.println("\nPeserta survei ke-" + (i+1));
            jumlah = 0;
            for (int a = 0; a < survei[i].length; a++){
                System.out.print("Masukkan nilai pertanyaan survei ke-" + (a+1) +" : ");
                nilai = sc.nextInt();
                if(nilai > 5 ){
                    System.out.println("nilai survei hanya 1-5");
                    a-=1;
                    continue;
                }

                survei[i][a] = nilai;

                jumlah += nilai;
            }
            System.out.println("Rata rata survei " + jumlah/survei[i].length + "\n");
        }

        for (int i = 0; i < survei[0].length; i++){
            jumlah = 0;
            for (int a = 0; a < survei.length; a++){
                jumlah += survei[a][i];
            }
            System.out.println("Rata rata nilai survei pertanyaan ke-" + (i+1) + " : " + jumlah/survei.length);
        }
    }
}
