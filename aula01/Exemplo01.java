// Tipos de variaveis em java

/*
String -> Armazena texto
char -> Armazrna uma única letra
int -> números inteiros
float -> números decimais
double -> números decimais. Maior precisão
*/

/* Regras para criar variáveis
 * Toda váriavel DEVE começar com letra minúscula
 * Não pode haver espaço no nome da variável
 * nomeAluno, enderecoCliente, produtoAdquirido
 */

public class Exemplo01{

    public static void main(String[] args) {
        
        String nome = "William José";
        int idade = 16;
        boolean chuva = true;//Em variáveis booleanas eu uso true ou false
        char letra = 'W'; // Todo char DEVE estar com aspas simples ''
        double salario = 5500.00;
        float altura = (float) 1.75; // Estou convertendo um double para float

        System.out.println(nome);
        System.out.println("Minha idade é " + idade);
        System.out.println("Está chovendo? " + chuva);
        System.out.println("A inicial do meu nome é: " + letra);
        System.out.println("Meu salário é " + salario);
        System.out.println("Eu tenho: " + altura + "metros");


    }

}