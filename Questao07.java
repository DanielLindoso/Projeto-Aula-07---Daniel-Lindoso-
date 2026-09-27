import java.util.Random;

public class Questao07
{
    public static void main(String[] args)
    {
        System.out.println("===== LETRA A =====");

        int[][] m = new int[3][4];

        int impar = 1;

        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[i].length; j++)
            {
                m[i][j] = impar;
                impar = impar + 2;
            }
        }

        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[i].length; j++)
            {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n===== LETRA B =====");

        int[][] matrizAleatoria = new int[3][4];

        Random sorteio = new Random();

        for(int i = 0; i < matrizAleatoria.length; i++)
        {
            for(int j = 0; j < matrizAleatoria[i].length; j++)
            {
                matrizAleatoria[i][j] = sorteio.nextInt(41) + 10;
            }
        }

        for(int i = 0; i < matrizAleatoria.length; i++)
        {
            for(int j = 0; j < matrizAleatoria[i].length; j++)
            {
                System.out.print(matrizAleatoria[i][j] + "\t");
            }
            System.out.println();
        }
    }
}