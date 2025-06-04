package televisao;

public class Tv {
//-tamanho de tela (em polegadas);
//-volume: de 1 a 10 iniciando em 5 (somente no construtor);
//-marca;
//-voltagem (220 e 110);
//-canal
    private int tamanho;
    private int volume=5;
    private String marca;
    private int voltagem;
    private int canal=1;
    private boolean ligaDesliga=false;

    public Tv(String marca, int tamanho, int voltagem){
        this.marca = marca;
        this.tamanho = tamanho;
        this.voltagem = voltagem;
        this.volume = volume;
        this.canal = canal;
        this.ligaDesliga = ligaDesliga;
    }
    public void setMarca(){this.marca=marca;}
    public String getMarca(){return marca;}

    public void setTamanho(){this.tamanho=tamanho;}
    public int getTamanho(){return tamanho;}

    public void setVoltagem(){this.voltagem=voltagem;}
    public int getVoltagem(){return voltagem;}

    //- ligar: ao ligar a televisão deve imprimir seu consumo. O
    //consumo deve ser definido pela voltagem multiplicada pela
    //quantidades de polegadas;
    public void ligar(){
        if(ligaDesliga==false){
            int consumo = voltagem*tamanho;
            System.out.println("tv foi ligada. atualmente consumindo "+consumo+".");
            ligaDesliga=true;
        }else{System.out.println("tv ja esta ligada");}
    }
    //- desligar;
    public void desligar(){
        if(ligaDesliga == true){
            System.out.println("tv foi desligada");
            ligaDesliga=false;
        }else{System.out.println("tv ja esta desligada");}
    }


    //- aumentar e diminuir o volume;
    public void aumentarVolume(){
        if(volume==10){
            System.out.println("10 volume maximo");
        }else{
            volume++;
            System.out.println("volume atual: "+volume);
        }
    }
    public void diminuirVolume(){
        if(volume==0){
            System.out.println("0 volume minimo");
        }else{
            volume--;
            System.out.println("volume atual: "+volume);
        }
    }
//- subir e descer canal
    public void subirCanal(){
        canal++;
        System.out.println("canal atual: "+canal);
    }
    public void descerCanal(){
        if(canal==1){
            System.out.println("1 é o menor canal");
        }else{
            canal--;
            System.out.println("canal atual: "+canal);
        }
    }

}
