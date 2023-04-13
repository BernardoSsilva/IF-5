import java.util.Scanner;

public class atividade24{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeticoes;
        System.out.print("Digite a quantidade de repetições desejadas: ");
        repeticoes = scan.nextInt();
        for(int i = 1; i <= repeticoes; i++){
            while (true) {
                System.out.print("Digite um número: ");
                while (true) { // enquanto não digitar um número válido, continua no while
                    try {
                        Float numero = Float.parseFloat(scan.next());
                        if(numero == 0){
                            System.out.println("Zero");
                            break;
                        }else if(numero > 0){
                            System.out.println("Número positivo");
                            break;
                        }else{
                            System.out.println("Número negativo");
                            break;
                        }
                        
                    } catch (NumberFormatException e){
                        System.out.println("Caractere Inválido");
                        System.out.println("Digite novamente");
                    }
                    
               }
               break;
            }
            
        }
    }
}