package lab09;

import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;
public class testmain {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter directory name: ");
		String dirname = sc.nextLine();
		System.out.print("Enter filename: ");
		String fname = sc.nextLine();
		File file = new File(dirname);
		sc.close();
		if(file.isDirectory() && file.exists()) {
			try{
				long x = file.lastModified();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				String name = dateFormat.format(x);
				SimpleDateFormat timeformat = new SimpleDateFormat("dd-MM-yyyy HHmmss");
				String name2 = timeformat.format(x);
				String k = name2.substring(11);
				FileWriter writer = new FileWriter(file.getPath()+"/"+k+"-"+fname);
				writer.write(name);
				writer.close();
				
				}catch(IOException e){
				System.out.println(e.getMessage());

				}
		}else {
			try{
			
				file.mkdir();
				long x = file.lastModified();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				String name = dateFormat.format(x);
				
				SimpleDateFormat timeformat = new SimpleDateFormat("dd-MM-yyyy HHmmss");
				String name2 = timeformat.format(x);
				String k = name2.substring(11);
				
				FileWriter w = new FileWriter(file.getPath()+"/"+k+"-"+fname);
				w.write(name);
				w.close();
				
				
				} catch(IOException e){
				System.out.println(e.getMessage());

				}
		}
		
		
		
		
		
	}
}
	
	

	
