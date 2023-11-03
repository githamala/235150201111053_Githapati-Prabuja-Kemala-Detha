package aok;
import java.util.Scanner;
public class konversi {
    public static String binaryToHex(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toHexString(decimal);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("anda ingin konversi bilangan apa?(ketik nomor nya saja )");
            

        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Hexa");
        System.out.println("4. Hexa ke Biner");
        System.out.println("5. Desimal ke Hexa");
        System.out.println("6. Hexa ke Desimal");
        int masukan = input.nextInt();
        input.nextLine();  // tambahkan baris ini supaya ga eror karena next int ga bisa baca baris baru kalo setelah nya nextline
        

        if (masukan==1){
            System.out.println("masukkan nilai biner yang ingin dirubah ke desimal");
            String biner = input.nextLine();
            int desimal = Integer.parseInt(biner, 2);
            System.out.println("maka hasilnya adalah "+ desimal);
        }
        else if (masukan==2){
            System.out.println("masukkan nilai desimal yang ingin di rubah ke biner");
                int desimal = input.nextInt();
                String biner = Integer.toBinaryString(desimal);
                System.out.println("maka hasilnya adalah "+ biner);

        } 
        else if (masukan==3){
            System.out.println("masukkan nilai biner yang ingin dirubah ke hexa.");
            String biner = input.nextLine();
            String hexa = binaryToHex(biner);
            System.out.println("maka hasilnya adalah "+hexa);
        }
        else if (masukan==4){
            System.out.println("masukkan nilai hexa yang ingin di rubah ke biner ");
            String hexa = input.nextLine();
            int desimal = Integer.parseInt(hexa);
            String biner = Integer.toHexString(desimal);
            System.out.println("maka hasilnya adalah "+biner);
        }
        else if (masukan==5){
            System.out.println("masukkan nilai desimal yang ingin di rubah ke hexa");
            int desimal = input.nextInt();
            String hexa = Integer.toHexString(desimal);
            System.out.println("maka hasilnya adalah "+hexa);
        }
        else if (masukan==6){
            System.out.println("masukkan nilai hexa yang ingin dirubah ke desimal.");
            String hexa = input.nextLine();
            int desimal = Integer.parseInt(hexa);
            System.out.println("maka hasilnya adalah "+desimal);
        }
        else {
            System.out.println("input yang anda masukkan salah.");
        }
    }
}
