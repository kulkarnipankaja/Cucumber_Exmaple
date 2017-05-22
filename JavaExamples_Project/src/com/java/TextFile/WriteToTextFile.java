package com.java.TextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToTextFile {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
			String filePath="c:\\selenium\\sele.txt";
			FileWriter fw;
			try {
				fw = new FileWriter(filePath);
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write("This is from java");
				bw.write("This is from java2");
				bw.newLine();
				bw.write("This is from java3");
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error Creating file");
				e.printStackTrace();
			}
			
			
	}

}
