import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        estoque mercadoria = new estoque();
       // String nomeProduto = leitor.toString();
        mercadoria.setNomeProduto("Pão de forma");
        mercadoria.setLoteProduto("1234x");
        mercadoria.setMarcaProduto("Fofinho");

        System.out.println(mercadoria);
    }
}
