public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String meuNome = "Jonata";
        /* 
        private static int a = 1;
        private static byte b = 2;
        private static short c = 3;
        private static long l = 444444444444l;
        private static double d = 5;
        private static float f = 6.1f;
        private static boolean b = true;
        private static char c;
        */
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int num = 5;
        num = 10;
        
        System.out.println(num);

        final double PI = 3.14;
    }
}
