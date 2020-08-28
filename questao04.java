import java.util.Scanner;

class Main {
  
  public static void main(String args[]){
    question04();

  }
    public static void question04(){
    Scanner leitor = new Scanner(System.in);
    System.out.print("Insira o valor de N: ");
    double valorN = leitor.nextDouble();

    System.out.println("O valor de S é: " + calculo(valorN));
  }

  // Função de cálculo: questão 04
  public static double calculo(double n){
    double formulaS = 2.66;

    int fatorial = calcFatorial((int) n);

    return formulaS + (1/fatorial);
  }

  public static int calcFatorial(int n){
    //algoritmo fatorial
    double fatorial = 1;
    while(n > 1) {
      fatorial *= n;
      n -= 1;
    }

    return fatorial;
  }