/**
 * 
 */
package niotest;
//import java.io.IOException;
import java.nio.file.*;
import java.util.List;
/**
 * 
 */
public class cursojava2 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
Path p1 = Paths.get("/home/cybermago/PROGRAM/JAVA/LearnJava3/Curse/src/file.txt");

	try {
	
	List<String> linhas = Files.readAllLines(p1);
	
	/*for(String linha: linhas) {
		System.out.println(linha);
	 }
	*/
	
	linhas.forEach(linha -> System.out.println(linha));
			
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("ERRO");
	}
 }
	
}
