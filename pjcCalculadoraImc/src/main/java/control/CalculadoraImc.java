/*package control;

public class CalculadoraImc {

    public void calcularImc(double peso, double altura, int idade, String sexo) {

        double imc = peso / (altura * altura);

        //TO DO implementar a lógica da calculadora de IMC
        //tendo como retorno o nome de uma faixa de valores
        // Ex.: "Baixo peso muito grave"
    }
}
*/

package control;

import java.util.Scanner;

public class CalculadoraImc {

    private static int idade;
    private static boolean sexo;
    private static boolean masculino;
    private static boolean feminino;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a idade: ");
        scanner.nextInt();

        System.out.print("Digite o sexo (masculino/feminino): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Digite a altura em metros (por exemplo, 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();


        double imc = calcularIMC(peso, altura);


        System.out.println("\nIMC Calculado: " + imc);
        exibirClassificacaoIMC(imc);

        scanner.close();
    }

    // calcular o IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    //exibir a classificação do IMC

    public static void exibirClassificacaoIMC(double imc) {


        if (idade > 20 && idade < 65 ){
            if (imc < 16) {
            System.out.println("Classificação: Baixo peso muito grave.");
        }
        else if (imc > 16 && imc <= 16.99) {
            System.out.println("Classificação: Baixo peso grave.");
        }
        else if (imc > 17 && imc <= 18.49) {
            System.out.println("Classificação: Baixo peso.");
        }
        else if (imc > 18.50 && imc <= 24.99)
            System.out.println("Classificação: Peso normal.");
        else if (imc > 25 && imc <= 29.99) {
            System.out.println("Classificação: Sobrepeso.");
        }
        else if (imc > 30 && imc <= 34.99) {
            System.out.println("Classificação: Obesidade grau I.");
        }
        else if (imc > 35 && imc <= 39.99) {
            System.out.println("Classificação: Obesidade grau II.");
        }
        else if (imc > 40) {
            System.out.println("Classificação: Obesidade grau III.");
        }


    }
        else if (idade < 20  ){
            if (sexo == masculino){
                if (imc < 16) {
                    System.out.println("Classificação do menino: Baixo peso muito grave.");
                }
                else if (imc > 16 && imc <= 16.99) {
                    System.out.println("Classificação do menino: Baixo peso grave.");
                }
                else if (imc > 17 && imc <= 18.49) {
                    System.out.println("Classificação do menino: Baixo peso.");
                }
                else if (imc > 18.50 && imc <= 24.99)
                    System.out.println("Classificação do menino: Peso normal.");
                else if (imc > 25 && imc <= 29.99) {
                    System.out.println("Classificação do menino: Sobrepeso.");
                }
                else if (imc > 30 && imc <= 34.99) {
                    System.out.println("Classificação do menino: Obesidade grau I.");
                }
                else if (imc > 35 && imc <= 39.99) {
                    System.out.println("Classificação do menino: Obesidade grau II.");
                }
                else if (imc > 40) {
                    System.out.println("Classificação do menino: Obesidade grau III.");
                }

            else{
                if (imc < 16) {
                    System.out.println("Classificação da menina: Baixo peso muito grave.");
                } else if (imc > 16 && imc <= 16.99) {
                    System.out.println("Classificação da menina: Baixo peso grave.");
                } else if (imc > 17 && imc <= 18.49) {
                    System.out.println("Classificação da menina: Baixo peso.");
                } else if (imc > 18.50 && imc <= 24.99)
                    System.out.println("Classificação da menina: Peso normal.");
                else if (imc > 25 && imc <= 29.99) {
                    System.out.println("Classificação da menina: Sobrepeso.");
                } else if (imc > 30 && imc <= 34.99) {
                    System.out.println("Classificação da menina: Obesidade grau I.");
                } else if (imc > 35 && imc <= 39.99) {
                    System.out.println("Classificação da menina: Obesidade grau II.");
                } else if (imc > 40) {
                    System.out.println("Classificação da menina: Obesidade grau III.");
                }
            }
           }
        }

        else if (idade > 66 && idade < 120 ){
            if (sexo == masculino){
                if (imc < 16) {
                    System.out.println("Classificação: Baixo peso muito grave.");
                }
                else if (imc > 16 && imc <= 16.99) {
                    System.out.println("Classificação: Baixo peso grave.");
                }
                else if (imc > 17 && imc <= 18.49) {
                    System.out.println("Classificação: Baixo peso.");
                }
                else if (imc > 18.50 && imc <= 24.99)
                    System.out.println("Classificação: Peso normal.");
                else if (imc > 25 && imc <= 29.99) {
                    System.out.println("Classificação: Sobrepeso.");
                }
                else if (imc > 30 && imc <= 34.99) {
                    System.out.println("Classificação: Obesidade grau I.");
                }
                else if (imc > 35 && imc <= 39.99) {
                    System.out.println("Classificação: Obesidade grau II.");
                }
                else if (imc > 40) {
                    System.out.println("Classificação: Obesidade grau III.");
                }
            }
            else if (sexo == feminino){
                if (imc < 16) {
                    System.out.println("Classificação: Baixo peso muito grave.");
                }
                else if (imc > 16 && imc <= 16.99) {
                    System.out.println("Classificação: Baixo peso grave.");
                }
                else if (imc > 17 && imc <= 18.49) {
                    System.out.println("Classificação: Baixo peso.");
                }
                else if (imc > 18.50 && imc <= 24.99)
                    System.out.println("Classificação: Peso normal.");
                else if (imc > 25 && imc <= 29.99) {
                    System.out.println("Classificação: Sobrepeso.");
                }
                else if (imc > 30 && imc <= 34.99) {
                    System.out.println("Classificação: Obesidade grau I.");
                }
                else if (imc > 35 && imc <= 39.99) {
                    System.out.println("Classificação: Obesidade grau II.");
                }
                else if (imc > 40) {
                    System.out.println("Classificação: Obesidade grau III.");
                }
            }
            else {
                System.out.println("idade maior que 20");
            }
        }
        else{
            System.out.println("idade invalida");
        }
}}

