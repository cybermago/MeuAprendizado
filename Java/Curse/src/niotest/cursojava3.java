/**
 * 
 */
package niotest;
import java.nio.file.*;
/**
 * 
 */
public class cursojava3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Path imgant = Paths.get("/home/cybermago/PROGRAM/JAVA/LearnJava3/Curse/src/logo.png");
Path imgnew = Paths.get("/home/cybermago/PROGRAM/JAVA/LearnJava3/Curse/src/logonova.jpg");
	
	try {
		byte[] bytesLogoNova=Files.readAllBytes(imgnew);
		Files.write(imgant, bytesLogoNova);
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("ERRO");
	}
	
	}

}
