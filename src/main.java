import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;

        System.out.print("İlk numarayı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci numarayı giriniz : ");
        n2 = input.nextInt();

        System.out.print("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
        System.out.println("Seçiminiz ");
        select = input.nextInt();

        switch(select) {
            case 1:
                System.out.println(n1 + n2);
                break;

            case 2:
                System.out.println(n1 - n2);
                break;

            case 3:
                System.out.println(n1 * n2);
                break;

            case 4:
                System.out.println(n1 / n2);
                break;

            default:
                System.out.println("Hatalı işlem yaptınız!");
                break;
        }

        }
    }


