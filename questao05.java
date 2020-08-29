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

 