public class Questao02
{
    public static void main(String[] args)
    {
        // a) Declaração
        int vet[];

        // b) Após a declaração
        System.out.println("b) Após a declaração, vet = null");

        // c) Instanciação
        vet = new int[15];

        // d) Valor de vet[5]
        System.out.println("d) Valor de vet[5]: " + vet[5]);

        // e) Tamanho do vetor
        int tam = vet.length;
        System.out.println("e) Valor de tam: " + tam);

        // f) Último elemento
        System.out.println("f) Último elemento (indice 14): "
                           + vet[14]);

        // g) Índice do primeiro elemento
        System.out.println("g) Índice do primeiro elemento: 0");

        // h) Declaração e instanciação do vetor medias
        double medias[] = new double[20];

        System.out.println("h) Vetor medias criado com "
                           + medias.length + " posições.");
    }
}