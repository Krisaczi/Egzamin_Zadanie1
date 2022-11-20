import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę jabłek.");
        int jablko = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj liczbę pomarańczy.");
        int pomarancz = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj liczbę złotych monet.");
        int moneta = Integer.parseInt(scanner.nextLine());
        System.out.println("Wejście: " + jablko + " " + pomarancz +" "+moneta);
        calculate(jablko,pomarancz,moneta);

    }
    public static void calculate(int jablko, int pomarancz, int monety){

        for(int i = 0; i < monety; i++){
            if(jablko <= pomarancz) {
                jablko++;
            }else {
                pomarancz++;
            }
        }
        System.out.println("Minimalna różnica: " +Math.abs(jablko-pomarancz));
        System.out.println("Ilość jabłek: " + jablko);
        System.out.println("Ilość pomarańczy: " + pomarancz);


    }
}
