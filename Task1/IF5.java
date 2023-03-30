package Task1;

import java.util.Scanner;

public class IF5{
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            System.out.println("O número é: "+num);
    
            sc.close();
        }catch(Exception e){
            System.out.println("Caractere invalido");
        }
        
    }
}