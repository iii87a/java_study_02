package kr.or.yi.java_study_02.ch08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		 //write01();

		//file_copy("department.txt", "copy_department.txt");
		
		file_buf_copy("department.txt", "copy_department.txt");
	}

	private static void file_buf_copy(String src, String dest) {
		String filePath = System.getProperty("user.dir") + "\\data\\";

		long start = System.nanoTime();
		try (FileReader fr = new FileReader(filePath + src); FileWriter fw = new FileWriter(filePath + dest)) {
			char[] buf =new char[2048];
			while ((fr.read(buf)) != -1) {
				fw.write(buf);
				
			}
		
	
		long end = System.nanoTime();
		
		System.out.println("파일복사 완료"+ (end-start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

	private static void file_copy(String src, String dest) {
		String filePath = System.getProperty("user.dir") + "\\data\\";

		long start = System.nanoTime();
		try (FileReader fr = new FileReader(filePath + src); FileWriter fw = new FileWriter(filePath + dest)) {
			int c;
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}
		
	
		long end = System.nanoTime();
		
		System.out.println(end-start);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void write01() {
		Scanner sc = new Scanner(System.in);
		String filePath = System.getProperty("user.dir") + "\\data\\test.txt";

		try (FileWriter fw = new FileWriter(filePath);) {
			while (true) {
				String line = sc.nextLine();
				if (line.length() == 0) {
					break;
				}
				fw.write(line);
				fw.write("\r\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
