public class Questao03
{
    public static void main(String[] args)
    {
        System.out.println("===== LETRA A =====");

        int[] v = new int[10];

        int impar = 1;

        for(int i = 0; i < v.length; i++)
        {
            v[i] = impar;
            impar = impar + 2;
        }

        System.out.println("Vetor de impares:");

        for(int i = 0; i < v.length; i++)
        {
            System.out.println("v[" + i + "] = " + v[i]);
        }

        System.out.println("\n===== LETRA B =====");

        double[] notas = new double[5];

        for(int i = 0; i < notas.length; i++)
        {
            do
            {
                notas[i] = Teclado.leDouble(
                    "Digite a nota " + (i + 1) + ": "
                );

                if(notas[i] < 0 || notas[i] > 10)
                {
                    System.out.println("Nota invalida!");
                }

            }while(notas[i] < 0 || notas[i] > 10);
        }

        System.out.println("\nNotas armazenadas:");

        for(int i = 0; i < notas.length; i++)
        {
            System.out.println("nota[" + i + "] = " + notas[i]);
        }
    }
}