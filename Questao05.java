public class Questao05
{
    public static void main(String[] args)
    {
        int[][] mat = {
            {7, 8, 9, 19},
            {2, -5, 4, 6},
            {11, 12, 13, 15},
            {20, 25, 29, 30},
            {17, 14, 19, 22}
        };

        int x = 2;

        System.out.println("a) Quantidade de linhas: " + mat.length);

        System.out.println("b) Quantidade de colunas: " + mat[0].length);

        System.out.println("c) O valor 19 esta em mat[0][3] e mat[4][2]");

        System.out.println("d) mat[1][1] = " + mat[1][1]);

        System.out.println("e) mat[2][0] + 1 = " + (mat[2][0] + 1));

        System.out.println("f) mat[3+1][3-1] = " + mat[3 + 1][3 - 1]);

        System.out.println("g) mat[x][x] = " + mat[x][x]);

        System.out.println("h) mat[x+1][x] = " + mat[x + 1][x]);

        System.out.println("i) mat[x][x] + 1 = " + (mat[x][x] + 1));

        System.out.println("j) mat.length = " + mat.length);

        System.out.println("k) mat[mat.length - 1][1] = "
                           + mat[mat.length - 1][1]);

        System.out.println("l) Quantidade de numeros armazenados = "
                           + (mat.length * mat[0].length));
    }
}