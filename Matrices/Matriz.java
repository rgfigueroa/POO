import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        int sumaDiagonal = 0;
        int sumaDiagonalSecuandaria=0;

        System.out.println("Aprendiendo Matrices");
        System.out.println("Demo");
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }
        // Mostrar el contenido de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("\t" + matriz[i][j]);
                if (i == j) {
                    sumaDiagonal= sumaDiagonal+matriz[i][j];
                }
                suma = suma + matriz[i][j];

                if(i<j)
                {
                    sumaDiagonalSecuandaria = sumaDiagonalSecuandaria+matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("La suma de la matriz es:" + suma);
        System.out.println("Suma de la Diagonal:" + sumaDiagonal);
        System.out.println("Suma de la Diagonal Secundaria:" + sumaDiagonalSecuandaria);

        String estudiantes[][]= {{"Juan", "Pedro"},{"Ana", "Julia"}};
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes.length; j++) {
                System.out.print("\t" + estudiantes[i][j]);
            }
        }
    }
}
