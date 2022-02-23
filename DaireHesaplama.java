import java.util.Scanner;
public class DaireHesaplama {

    public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
    System.out.print("Merkez açıyı giriniz:");
    int a = scan.nextInt();
    System.out.print("Yarıçapı giriniz:");
    int r = scan.nextInt();
    double cevre = 2*3.14*r;
    double alan = 3.14*r*r*a/360;
    System.out.println("Dairenin çevresi "+cevre+" Dairenin alanı "+ alan);

    }
}
