public class Questao04
{
    public static void main(String[] args)
    {
        Questao04 obj = new Questao04();

        int[] vetor = new int[5];

        System.out.println("Digite os valores do vetor:");

        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = Teclado.leInt("Valor " + (i + 1) + ": ");
        }

        double media = obj.calculaMedia(vetor);

        System.out.println("Media fora do metodo: " + media);

        obj.contaMultiplos(vetor);
    }

    public double calculaMedia(int[] vet)
    {
        int soma = 0;

        for(int i = 0; i < vet.length; i++)
        {
            soma = soma + vet[i];
        }

        double media = (double)soma / vet.length;

        System.out.println("Media dentro do metodo: " + media);

        return media;
    }

    public void contaMultiplos(int[] vet)
    {
        int contador = 0;

        for(int i = 0; i < vet.length; i++)
        {
            if(vet[i] % 3 == 0 && vet[i] % 5 == 0)
            {
                contador++;
            }
        }

        System.out.println(
            "Quantidade de multiplos comuns de 3 e 5: "
            + contador
        );
    }
}