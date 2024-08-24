public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTressParcelas(){
        return 3;
    }


    public static double getTaxa(){
        return 0.45;
    }

    public static void calc(double valor, int parcelas){
        if(parcelas == 2){
            double valorFinal = valor + (valor + getTressParcelas());
            System.out.println("Valor final 3 parcelas"+ valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTressParcelas());
            System.out.println("Valor final"+valorFinal);
        }else{
            System.out.println("invalido");
        }
    }
}
