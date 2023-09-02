import java.util.Scanner;
public class DaireAlaniveCevresi {
    public static void main(String[] args) {
        float pi=3.14f,r;
        double alan,cevre;
        Scanner girdi=new Scanner(System.in);
        System.out.print("Dairenin yarı çap değerini giriniz: ");
        r=girdi.nextFloat();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.print("Dairenin alanı: "+alan+"\nDairenin çevresi: "+cevre);


    }
}
