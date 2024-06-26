/**
 * 
 */
package io;

import java.nio.file.*;

/**
 * 
 */
public class CursoJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path diretorio = Paths.get("C:/PROGRAM/JAVA/LearnJava3/Curse/src/texto.txt");
		Path arquive = Paths.get("C:/PROGRAM/JAVA/LearnJava3/Curse/file.txt");
		// Diretorios de arquive de com
		if (Files.isDirectory(diretorio)) {
			System.out.println("Diretorio exists");
		} else {
			System.out.println("Diretorio not exists");
		} // Arquivos
		if (Files.exists(arquive)) {
			System.out.println("Diretorio exists");
		} else {
			System.out.println("Diretorio not exists");
		}
	}
}
