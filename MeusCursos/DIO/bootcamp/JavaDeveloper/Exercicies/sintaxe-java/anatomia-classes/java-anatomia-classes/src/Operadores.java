public class Operadores {

public static void main(String[] args) {
    
    String nomeCompleto = "linguagem" + "java";
    String concatenacao = "?";
    
    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);

    int numero = 5;

    System.out.println(-numero+"\n"+ +numero);

    numero = + 5;
    System.out.println(numero);

    numero = numero + 1;
    System.out.println(++numero+"\n"+numero--);

    boolean var = true;
    boolean var2 = false;
    System.out.println(!var);
    var = !var;

    int a=0,b =0;
    String resultado = "";

    if(a == b){
        resultado  = "verdadeiro";
    }
    else{
        resultado = "falso";
    }

    System.out.println(resultado);

    int resultado2 = a == b ? 1 : 0;

    int num1 = 0;
    int num2 = 0;

    boolean simnao = num1 == num2;

    System.out.println("num1 = num2"+ simnao);

    if(num1 < num2){
        System.out.println("num1 é menor que num2");
    }else{
        System.out.println("nao");
    }

    String nome1 = "jonata";
    String nome2 = new String("jonata");

    System.out.println(nome1 == nome2);
    System.out.println(nome1.equals(nome2));

    boolean condicao1=true;
    boolean condicao2=false;

    if(condicao1 && condicao2 && (7 > 4)){
        System.out.println("verdadeiro");
    }
    if(condicao1 || condicao2){

    }
}

}
