import java.util.Scanner;

class Main {
  
  public static void main(String args[]){
    question05();

  }
  public static void question05(){
    // quantidade de quadrados perfeitos
    int quantidadeQuadrados = 0;
    int j;

    Scanner leitor = new Scanner(System.in);

    do {
      System.out.print("Insira um número: ");
      j = leitor.nextInt();
      if(j >= -10_000 && j <= 10_000 && j != 0){
        double resul = Math.sqrt(j);
        quantidadeQuadrados += (int) resul == Double.valueOf(resul) ? 1 : 0;
      }
    } while(j != 0);

    System.out.println(quantidadeQuadrados);
  }

  public static void question06(){
    Scanner leitor = new Scanner(System.in);
    
    System.out.print("Digite o valor de m: ");
    int m = leitor.nextInt();

    if(m<10) {
      
      int fatorial = calcFatorial(m);

    }
    else{
      
    }

  }
  public static int divisivel(int div){
    double n1 = 1, n2 = 2;
    if(n1 >= 1 && n2 > 2){
        div = "O numero é divisivel";
        return div;

    }
    else{
         div = "O numero não é divisivel";
         return div;
  }
}