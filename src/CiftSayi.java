import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int sayi = input.nextInt();
        int adet = 0, toplam = 0;

        for(int i=1; i<= sayi; i++){
            if(i%3==0 && i%4==0){
                toplam +=i;
                adet++;
            }
        }
            double ort = toplam /(adet);
        System.out.println(adet + " sayi var");
        System.out.println("ortalamasi = " + ort);

    }
}
