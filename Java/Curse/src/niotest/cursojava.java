/**
 * 
 */
package niotest;
import java.nio.file.*;
/**
 * 
 */
public class cursojava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Path p1 = Paths.get("/home/cybermago/PROGRAM/JAVA/LearnJava3/Curse/src/file.txt");

if(Files.isDirectory(p1)) {
	System.out.println("Diretorio existe");
}else {
	System.out.println("diretorio não existe");
  }

if(Files.exists(p1)) {
	System.out.println("arquivo existe");
}else {
	System.out.println("arquivo não existe");
  }

 }
}