public class Questao01
{
    public static void main(String[] args)
    {
        int[] a = {507, 222, 147, 999, 300, 27, 888, -110, 45, 675};

        int x = 2;
        int y = 4;

        System.out.println("a) Índice do terceiro elemento: " + 2);

        System.out.println("b) Conteúdo do terceiro elemento: " + a[2]);

        System.out.println("c) Índice do primeiro elemento: " + 0);

        System.out.println("d) Conteúdo do primeiro elemento: " + a[0]);

        System.out.println("e) Índice do valor 888: 6");

        System.out.println("f) Valor de a[5]: " + a[5]);

        System.out.println("g) Valor de a[5] + 2: " + (a[5] + 2));

        System.out.println("h) Valor de a[5 + 2]: " + a[5 + 2]);

        System.out.println("i) Valor de a[x] + a[y] + 1: "
                           + (a[x] + a[y] + 1));

        System.out.println("j) Valor de a[x + y + 1]: "
                           + a[x + y + 1]);

        System.out.println("k) Tamanho do array: "
                           + a.length);

        System.out.println("l) Último elemento do array: "
                           + a[a.length - 1]);
    }
}