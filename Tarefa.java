import java.util.Scanner;

public class Tarefa
{

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int[] valoresMoedas = {5, 10, 25, 50, 100};
int escolha;
double soma = 0.0;
double Salgado = 2.50;
Double Refrigerante = 1.0;
double troco ;

System.out.println("Bem-vindo! Escolha uma moeda para adicionar ao valor total:");
System.out.println("1 - 5 centavos");
System.out.println("2 - 10 centavos");
System.out.println("3 - 25 centavos");
System.out.println("4 - 50 centavos");
System.out.println("5 - 1 real");
System.out.println("0 - Encerrar");


while (true) {
System.out.print("Escolha uma opção: ");
escolha = scanner.nextInt();

switch (escolha) {
case 0:
break;
case 1:
case 2:
case 3:
case 4:
case 5:
soma += valoresMoedas[escolha - 1] / 100.0;
System.out.println("Soma parcial: R$ " + soma);
break;
default:
System.out.println("Opção inválida. Escolha novamente.");
}

if (escolha == 0) {
break;
}
}

System.out.println("Soma final: R$ " + soma);
System.out.println("Programa encerrado. Obrigado!");

scanner.close();

if(soma >= Refrigerante || soma < Salgado){
troco = soma - Refrigerante;
System.out.println("Retire o Refrigerante. Troco: R$ " + troco);

}
if(soma >= Salgado){
troco = soma - Salgado;
System.out.println("Retire o salgadinho. Troco: R$ " + troco);

}




