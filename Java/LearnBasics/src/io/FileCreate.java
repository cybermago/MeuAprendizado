/**
 * 
 */
package io;

import java.util.Date;
import java.io.*;

/**
 * 
 */
public class FileCreate {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("file.txt");
		try {

			boolean isCreated = file.createNewFile();
			System.out.println("Created:" + isCreated);
			System.out.println("path:" + file.getPath());
			System.out.println("path absolute:" + file.getAbsolutePath());
			System.out.println("is directory:" + file.isDirectory());
			System.out.println("is File:" + file.isFile());
			System.out.println("is hidden:" + file.isHidden());
			System.out.println("Last modifield:" + new Date(file.lastModified()));
			boolean exists = file.exists();
			if (exists) {
				System.out.println("Deleted:" + file.delete());
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}