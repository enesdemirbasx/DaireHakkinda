import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,x;
        double pi=3.14,dalan,alan,cevre;
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r=input.nextInt();
        System.out.print("Daire diliminin merkez açısını giriniz: ");
        x=input.nextInt();
        alan=pi*r*r;
        cevre=2*pi*r;
        dalan=(pi*(r*r)*x)/360;
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre);
        System.out.print("Daire diliminin alanı: "+dalan);
    }
}