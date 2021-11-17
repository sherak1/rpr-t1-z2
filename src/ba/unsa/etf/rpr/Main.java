package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int broj;
        System.out.printf("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        broj = ulaz.nextInt();
        for (int i = 1; i <= broj; i++) {
            if (i%sumaCifara(i)==0){
                System.out.println(i);
        }
    }

}
        public static int sumaCifara ( int nekiBroj){
            int suma = 0;
            while (nekiBroj != 0) {
                suma += nekiBroj % 10;
                nekiBroj /= 10;

            }
            return suma;

        }
    }
