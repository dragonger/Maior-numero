package estruturaderepeticao.EstruturaDeRepeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int c = sc.nextInt();

        int maior = max(a,b,c);

        showResult(maior);

    }

    public static int max(int x,int y,int z){

        int aux;

        if (x>y && x>z){
            aux= x;
        }
        else if (y>z){
            aux= y;
        }
        else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Maior é: "+value);
    }

}
