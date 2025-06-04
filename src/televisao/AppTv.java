package televisao;
import java.util.Scanner;

public class AppTv {
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    //modelo
    System.out.print("modelo da tv: ");
    String modelo = teclado.nextLine();
    //tamanho
    System.out.print("tamanho da tv: ");
    int tamanho = teclado.nextInt();
    //voltagem
    System.out.print("voltagem (110 ou 220): ");
    int voltagem = teclado.nextInt();

    Tv tele = new Tv(modelo, tamanho, voltagem);
    System.out.println("marca: "+tele.getMarca()+"\ntamanho: "+tele.getTamanho()+"\nvoltagem: "+tele.getVoltagem());
    teclado.close();

    tele.ligar();
    tele.subirCanal();
    tele.descerCanal();
    tele.aumentarVolume();
    tele.diminuirVolume();
    tele.desligar();

    }

}
