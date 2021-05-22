package jogojava;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class JogoJava {

    public static void main(String[] args) {

        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int opcao;
        int escolha_computador;
        int escolha_usuario;

        show.println("Olá! Qual o seu nome?");
        String nome = scan.nextLine();
        show.println("\nPrazer em conhece-lo, "+nome+"!");
        show.println(nome + ", você quer jogar comigo?");
        show.println("Informe o número da sua opção.\n -> 1-Sim \n -> 2-Não");
        opcao = scan.nextInt();

        if(opcao == 2){

            show.println("Que pena! Mas tudo bem, fica para próxima!");
        } else if(opcao == 1) {
            
            show.println("\nOk! O jogo é assim...");
            show.println("Eu vou escolher um número de 0 a 10");
            show.println("Mas não vou falar para você qual foi");
            show.println("Se você conseguir adivinhar ");
            show.println("Você será o vencedor!!");

            escolha_computador = gerador.nextInt(11);

            show.println("\nOk! "+nome+". Eu já escolhi!");
            show.println("Agora tente adivinhar!");

            do{
                escolha_usuario = scan.nextInt();
                if(escolha_usuario != escolha_computador){
                    show.println("Resposta errada!");
                }else{
                    show.println("Parabéns! Você acertou!");
                }
           }while(escolha_computador != escolha_usuario);

        }

    }
}
    


