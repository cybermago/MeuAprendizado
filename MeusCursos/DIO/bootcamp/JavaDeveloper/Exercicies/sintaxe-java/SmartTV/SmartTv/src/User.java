public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smarttv = new SmartTv();

        System.out.println(smarttv.ligada);
        System.out.println(smarttv.canal);
        System.out.println(smarttv.volume);

        smarttv.diminuirVolume();
        smarttv.aumentarVolunme();
        System.out.println(smarttv.volume);

        smarttv.mudarcanal(13);


        smarttv.ligar();
        smarttv.desligar();
    }

}
