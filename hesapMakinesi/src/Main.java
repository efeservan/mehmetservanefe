import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("İlk sayiyi giriniz");
        int m = sc.nextInt();
        System.out.print("İkinci sayiyi giriniz");
        int n = sc.nextInt();

        System.out.println("1:Toplam 2:Fark 3:Bolme 4:Carpma");
        int secim = sc.nextInt();

        switch(secim){
            case 1:
                int toplam = m+n;
                System.out.print(toplam);
                break;
            case 2:
                int fark = m-n;
                System.out.print(fark);
                break;
            case 3:
                int bolum = m/n;
                System.out.print(bolum);
                break;
            case 4:
                int carpim = m*n;
                System.out.print(carpim);
                break;
            default:
                System.out.print("Yanlis secim yaptiniz");
        }
    }
}
