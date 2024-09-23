import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1 = 20 ;
        int num2 = 30 ;
        int resultN = num1*num2 ;

        System.out.println(resultN);

        String str1 = "ciao";
        int num3 = 20 ;

        String concat = str1 +" "+ num3 ;
        System.out.println(concat);

        // esercizi degli array

        String[] arr = {"ciao" , "sono" ,"stanco","di","tutto"};
        String str2 = " Anto ";

        String[] newArray = new String[6];
        newArray[0] = arr[0];
        newArray[1] = arr[1];
        newArray[2] = str2;
        newArray[3] = arr[2];
        newArray[4] = arr[3];
        newArray[5] = arr[4];

        System.out.println(Arrays.toString(newArray));

        // esercizi di stringa

        // serve per poter prendere gli input da tastiera

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa : ");
        String firstStr = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa' : ");
        String secStr = scanner.nextLine();

        System.out.println("Inserisci la terza stringa : ");
        String thirdStr = scanner.nextLine();

        String resultConcat = firstStr + " " + secStr + " " + thirdStr + " ";
        System.out.println("Il risultato del concatenamento e' : "+resultConcat);


        // esercizi di matematica

        int high = 20;
        int base = 10;
        int resultBasexAltezza = 2 * (high + base) ;
        System.out.println(resultBasexAltezza);





        // area di un triangolo equilatero

        System.out.println("Inserisci la lunghezza del lato a: ");
        double a = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del lato b: ");
        double b = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del lato c: ");
        double c = scanner.nextDouble();

        //semi perimetro
        double s = (a + b + c) / 2;

        // Formula di Erone
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Stampare l'area del triangolo
        System.out.println("L'area del triangolo è: " + area);


    }
}