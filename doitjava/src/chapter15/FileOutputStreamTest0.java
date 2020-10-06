package chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest0 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("a.zip");
			for(int i=0; i<5_000_000;i++) {
				fos.write((char)(int)(Math.random() * 70000));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("파일이 생성되었습니다.");
	}
}
