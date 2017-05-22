package com.java.TextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			String filePath ="c:\\selenium\\sele.txt";
			String line;
			FileReader fileReader =new FileReader(filePath);
			BufferedReader br=new BufferedReader(fileReader);
			System.out.println(br.readLine());
			
			while((line=br.readLine()) !=null){
				//String[] filename=line.split(",");
				
				System.out.println(line);
				
				
				
			}
			
			
			br.close();
			
	}

}
