import java.sql.Time;
import java.util.TimeZone;


public class Menssagem {
    public static void main(String[] args) {



    }
    public static void menssagem(int hora){
        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                bomdia();
            case 13:
            case 14:
                boatarde();
            case 15:
            case 16:
            case 17:
            case 18:
                boanoite();
                break;
            default:
                System.out.println("invalido");
                break;
        }
    }
    public static void bomdia(){
        System.out.println("bom dia");
    }
    public static void boatarde(){
        System.out.println("boa tarde");
    }
    public static void boanoite(){
        System.out.println("boa noite");
    }
}
