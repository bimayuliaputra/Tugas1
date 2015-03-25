public class Sembilan {
    public static void main(String[] args) {
        int awal=1;
        int akhir=110;
        
        System.out.println("Ini Menampilkan JONI Setiap Lokasi Angka Kelipatan 5");
        System.out.println("\n");

        for (int a=1;a<=akhir;a++){
            if(a%5==0){
                System.out.print("JONI");
            }else {
                System.out.print(a);
            }
            System.out.print(" ");
        }
    }
}