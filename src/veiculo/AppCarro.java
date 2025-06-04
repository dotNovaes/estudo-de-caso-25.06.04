package veiculo;
import java.util.Scanner;

public class AppCarro {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        //modelo
        System.out.print("modelo do carro: ");
        String modelo = teclado.nextLine();
        //velocidade
        System.out.print("velocidade maxima: ");
        int veloMax = teclado.nextInt();
        //marchas
        System.out.print("numero de marchas: ");
        int marchas = teclado.nextInt();



        Carro carro = new Carro(modelo, veloMax, marchas);
        System.out.println("modelo: "+carro.getModelo()+"\nnumero de marchas: "+carro.getNumMarchas()+"\nvelocidade maxima: "+carro.getVeloMax());

        carro.ligar();
        carro.desligar();
        carro.acelerar();
        carro.desacelerar();
        carro.virarDireita();
        carro.virarEsquerda();
        carro.marchaRe();
        carro.marchaBaixo();
        carro.marchaCima();
        carro.marchaCima();
        carro.marchaCima();
        carro.marchaBaixo();

    }
}
