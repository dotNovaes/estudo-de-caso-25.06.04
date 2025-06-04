package veiculo;

public class Carro {
    // atributos do carro
    private String modelo;
    private int veloMax;
    private int numMarchas;
    private boolean ligaDesliga=false;
    private int marcha=0;

    public Carro(String modelo, int veloMax, int marchas){
        this.modelo = modelo;
        this.veloMax = veloMax;
        this.numMarchas = marchas;
        this.ligaDesliga = ligaDesliga;
        this.marcha = marcha;
    }

    public void setModelo(String modelo){this.modelo = modelo;}
    public String getModelo(){return modelo;}

    public void setVeloMax(int veloMax){this.veloMax = veloMax;}
    public int getVeloMax(){return veloMax;}

    public void setNumMarchas(int marcha){this.numMarchas = marcha;}
    public int getNumMarchas(){return numMarchas;}

    // liga e desliga
    public void ligar(){
        if(ligaDesliga==false){
            System.out.println("carro foi ligado");
            ligaDesliga=true;
        }else{System.out.println("carro ja esta ligado");}
    }

    public void desligar(){
        if(ligaDesliga == true){
            System.out.println("carro foi desligado");
            ligaDesliga=false;
        }else{System.out.println("carro ja esta desligado");}
    }

    //esquerda, direita
    public void virarEsquerda(){System.out.println("seu carro virou a esquerda");}
    public void virarDireita(){System.out.println("seu carro virou a direita");}

    //marcha cima, baixo, ré
    public void marchaCima(){
        if(marcha==numMarchas){
            System.out.println("marcha maxima");
        }else{
            marcha++;
            if(marcha==0){
                System.out.println("marcha neutra");
            }else{System.out.println("marcha subiu para "+marcha);}
        }
    }
    public void marchaBaixo(){
        if(marcha==-1){
            System.out.println("marcha re esta engatada, impossivel diminuir");
        }else{
            if(marcha==0){
                System.out.println("marcha ja esta neutra");
            }else{
                marcha--;
                System.out.println("marcha desceu para "+marcha);
            }
        }

    }
    public void marchaRe(){
        marcha=-1;
        System.out.println("marcha re engatada");
    }

    //acelerar, desacelerar
    public void acelerar(){System.out.println("carro acelerando");}
    public void desacelerar(){System.out.println("carro desacelerando");}
}