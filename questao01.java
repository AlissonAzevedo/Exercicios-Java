import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe o valor a ser pago: ");
    int valorPago = leitor.nextInt();
    System.out.print("Informe o valor do produto: ");
    int valorProduto = leitor.nextInt();

    troco = valorPago - valorProduto;
    System.out.print("O valor do troco é de :"+ troco);

  }
}