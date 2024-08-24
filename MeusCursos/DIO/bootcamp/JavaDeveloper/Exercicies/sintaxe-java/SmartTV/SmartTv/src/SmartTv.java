public class SmartTv {

    boolean ligada=false;
    int canal=1;
    int volume = 25;

    public void mudarcanal(int novocanal){
        canal = novocanal;
    }

    public void ligar(){
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = false;
    }

    public void aumentarVolunme(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void aumentarcanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }


}
