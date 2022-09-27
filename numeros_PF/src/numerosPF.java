import java.util.Scanner;

public class numerosPF {

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);

        //Obtención de datos INICIO
        System.out.println("Números primos y serie Fibonacci");
        System.out.println("Ingresa la cantidad a generar");
        num = sc.nextInt();
        primitos serie1 = new primitos();
        fibonacci serie2 = new fibonacci();

        int[]seriePrimitos = serie1.generar(num);
        int[]serieFibonacci = serie2.generar(num);

        //Impresión numeros primos
        System.out.println("Números primos: ");
        for (int i=0; i<=num; i++)
        {
            System.out.println(seriePrimitos[i]);
        }

        //Impresión serie fibonacci
        System.out.println("Serie Fibonacci: ");
        for (int i=0; i<=num; i++)
        {
            System.out.println(serieFibonacci[i]);
        }

    }
}

//Metodo numprimitos
    class primitos{
    int limite;
    int[] seriePrimitos = new int[100];
    int ind=0;

    public int [] generar(int limite){

        for (int i=1; i<limite; i++)
        {
            int num=0;
            for (int j=1; j<=i; j++)
            {
                if (i%j==0){
                    num++;
                }
            }

            if (num==2){
                seriePrimitos[ind++]=i;
            }
        }
        return seriePrimitos;
    }
}

//Metodo serieFibonacci
    class fibonacci{
    int[] serieFibonacci = new int[100];

    public int[] generar(int limite){
        int x=0;
        int help1=1;
        int help2;

        for (int i=0; i<=limite; i++)
        {
            help2=x;
            x= help1 + x;
            help1=help2;
            serieFibonacci[i]=help1;
        }
        return serieFibonacci;
    }
}