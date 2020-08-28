import java.util.Scanner;

class Main {
  
  public static void main(String args[]){
    question03();

  }

  public static void question03(){
    //question 03
    double excesso = 0;
    double multa = 0;
    Scanner leitor = new Scanner(System.in);
    
    System.out.print("Insira o peso do peixes [Kg]: ");
    double peso = leitor.nextDouble();

    if(peso > 50){
      excesso =  peso - 50;
      multa =excesso * 4;
    }

    System.out.println("O peso excedente é: " + excesso);
    System.out.println("O valor da multa a ser pago é: " + multa);
  }