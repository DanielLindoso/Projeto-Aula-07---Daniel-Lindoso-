public class Questao06
{
    public static void main(String[] args)
    {
        // a) Declaracao
        int matriz[][];

        // b) Instanciacao
        matriz = new int[6][4];

        // c) Valor de matriz[1][3]
        System.out.println("c) Valor de matriz[1][3]: "
                           + matriz[1][3]);

        // d) Declaracao de matriz de double
        double notas[][];

        // Instanciacao apenas para demonstracao
        notas = new double[5][5];

        // e) Declaracao de matriz de char
        char letras[][];

        // Instanciacao apenas para demonstracao
        letras = new char[3][3];

        System.out.println("a) Matriz de inteiros declarada.");

        System.out.println("b) Matriz instanciada com 6 linhas e 4 colunas.");

        System.out.println("d) Matriz de double declarada.");

        System.out.println("e) Matriz de char declarada.");

        System.out.println("Linhas da matriz: "
                           + matriz.length);

        System.out.println("Colunas da matriz: "
                           + matriz[0].length);
    }
}