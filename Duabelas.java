public class Duabelas {
    public static void main(String[] args) {
        int panjang=3;
        int lebar=6; //butuh lebar karena dalam soal disuruh buat persegi panjang

        System.out.println("Ini Menampilkan Pager Persegi Panjang. Tetapi Pada Baris Genap, Akan Menjorok Kedalam");
        System.out.println("\n");

        for (int a=1;a<=lebar;a++){ //butuh lebar karena persegi panjang
            if (a%2==0){
                System.out.print(" ");
            }
            for (int b=1;b<=panjang;b++){   //untuk ukuran panjang
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
