public class Questao08
{
    public static void main(String[] args)
    {
        Questao08 obj = new Questao08();

        int[][] matriz = new int[2][3];

        double media = obj.calculaMedia(matriz);

        System.out.println("Media fora do metodo: " + media);

        obj.contaMultiplos(matriz);
    }

    public double calculaMedia(int[][] matriz)
    {
        int soma = 0;
        int contador = 0;

        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                matriz[i][j] = Teclado.leInt(
                    "Digite um numero: "
                );

                soma = soma + matriz[i][j];
                contador++;
            }
        }

        double media = (double)soma / contador;

        System.out.println(
            "Media dentro do metodo: " + media
        );

        return media;
    }

    public void contaMultiplos(int[][] matriz)
    {
        int quantidade = 0;

        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] % 3 == 0 &&
                   matriz[i][j] % 5 == 0)
                {
                    quantidade++;
                }
            }
        }

        System.out.println(
            "Quantidade de multiplos comuns de 3 e 5: "
            + quantidade
        );
    }
}