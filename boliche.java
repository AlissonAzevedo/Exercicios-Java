import java.util.Scanner;

public class boliche {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int pontuacao = 0;
        //int TotalPinosDerrubados = 0;
        int primeiraJogada, segundaJogada;

        for(int rodada = 1; rodada <= 10; rodada++){
            System.out.print("\tRodada Nº "+ rodada +"\n");
            System.out.print("Informe a quantidade de pinos derrubada na primeira Jogada: "+"\n");
            primeiraJogada =  leitor.nextInt();


            if(primeiraJogada == 10){
                System.out.print("strike! "+"\n");
                pontuacao += 10;

            }
            else{
                System.out.print("Informe a quantidade de pinos derrubada na segunda Jogada: "+"\n");
                segundaJogada =  leitor.nextInt();

                pontuacao += primeiraJogada + segundaJogada;

            }

        }
        System.out.println("O total de pinos derrubados é: " + pontuacao);
    }
}
