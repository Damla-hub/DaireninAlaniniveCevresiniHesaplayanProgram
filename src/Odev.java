import java.util.Scanner;
public class Odev {
    public static void main(String[] args) {
        double r,result, pi=3.14;
        short a;
        Scanner inp=new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz: ");
        r=inp.nextDouble();
        r=r>360 ? r%360 : r;
        System.out.print("Merkez açı ölçüsünü giriniz: ");
        a=inp.nextShort();
        result=(pi*(r*r)*a)/360;
        System.out.print("Daire diliminin alanı: "+result);

    }
}
