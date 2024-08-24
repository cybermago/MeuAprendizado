import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        String nome = "nome";

        try {
            imprimir(nome);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            JOptionPane.showInputDialog("Revise o nome do arquivo"+e.getCause());
        }
        catch (IOException e){
            JOptionPane.showInputDialog(null+ "erro");
            e.printStackTrace();
        }
        System.out.println("...");
    }
    public static void imprimir(String nome) throws IOException {
        File file = new File(nome);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        }while(line != null);
        bw.flush();
        br.close();
    }
}