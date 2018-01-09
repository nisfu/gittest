import java.util.Scanner;
public class perhitungan {
public static void main(String[] args){
	int panjang;
	int lebar;
	double luas;
	
	Scanner a = new Scanner(System.in);
	System.out.println("Menghitung Luas Persegi Panjang");
	System.out.print("Masukkan Panjang : ");
	panjang = a.nextInt();
	System.out.print("Masukkan Lebar : ");
	lebar = a.nextInt();

	luas = (panjang*lebar);
	System.out.println("Luas Persegi Panjang = "+luas);
	}
}
