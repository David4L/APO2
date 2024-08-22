import java.util.Random;
import java.util.Scanner;

public class ciudadest {

    public static void main(String[] args) {

        final int COLUM = 6; 
        final int FIL = 2; 

        System.out.println("---------[Temperatura en Ciudades]-----------");

        Object matriz[][] = new Object[FIL][COLUM]; 
        Random numerorandom = new Random();

        int min_Temperatura = 10;
        int max_Temperatura = 40;

        matriz[0][0] = "Bogota";
        matriz[0][1] = "Cali";
        matriz[0][2] = "Medellin";
        matriz[0][3] = "Pasto";
        matriz[0][4] = "Barranquilla";
        matriz[0][5] = "Manizales";

        for (int j = 0; j < COLUM; j++) {
            int temperaturaAleatoria = numerorandom.nextInt(max_Temperatura - min_Temperatura + 1) + min_Temperatura;
            matriz[1][j] = temperaturaAleatoria; 
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione Enter para empezar...");
        scanner.nextLine();
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COLUM; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}


