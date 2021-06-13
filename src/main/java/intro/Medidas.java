// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        // Condicional = verificar uma condição - fazer yma pergunta para uma pessoa, hardware ou software

        // Utilizar classe Scanner do Java para  ler a escolha do usário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U  D E  O P Ç Õ E S");
        System.out.println("c - Calcular area modo curto");
        System.out.println("e - Calcular area modo exterso");
        System.out.println("i - Calcular area modo if curto");
        System.out.println("Digite a opção desejada!");
        String opcao = scanner.next();


        // Switch - selecionar o comportamento do programa conforme a escolha da pessoa ou do softare.

       // String opcao = "nada";
        switch (opcao){
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método if simples");
                ifSimpes();
                break;
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método Calcular Area Modo Compacto");
                calcularAreaModoCompacto();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método Calcular Area Modo Extenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolheu uma opção que não tem uma ação associada");
                calcularAreaModoCompacto();
        }
         }
    public static void ifSimpes(){
        // Condicional = verificar uma condição - fazer yma pergunta para uma pessoa, hardware ou software

        // if = se
        // else = senão

        String modo = "curto";

        if ( modo == "curto"){
            calcularAreaModoCompacto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }
    public static void calcularAreaModoCompacto(){
        System.out.println("Calcular Area Modo Compacto");
        // Calcula de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }
    public static void calcularAreaModoExtenso(){
        System.out.println("Calcular Area Modo Extenso");
        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + "m²");
    }
}
