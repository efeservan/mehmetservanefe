import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gidilen kilometreyi yaziniz: ");
        double km = sc.nextInt();
        double fatura = 10.0+(km*2.2);
        if(fatura<20){
            fatura = 20;
        }
        System.out.println("Odenecek tutar : "+fatura+" tl'dir");
    }
}
