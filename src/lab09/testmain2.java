package lab09;

import java.io.*;
import java.util.Scanner;

public class testmain2 {

	public static void main(String[] args)  {
	
		try{
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter directory name: ");
			String listfile = sc.nextLine();
			File file = new File(listfile);
			
			if(file.isDirectory() && file.exists()) {
				String[] files = file.list();
				int size = files.length;
				if(size == 0) {
					System.out.println("Empty Directory.");
					
				}else {
					int i = 1;
					for(String fileName: files){
						System.out.printf("%d. %s\n",i,fileName);
						i++;
						
				}
					while(true) {
					System.out.print("Enter file number: ");
					int select = sc.nextInt();
					
					if(select <= size && select != 0){
						String data = files[select-1];
						Scanner scan = new Scanner(new File(file.getPath()+"/"+data));
	
						while(scan.hasNext()){
							String line = scan.nextLine();
							System.out.println("=== Content of "+data+" ===\n"+line);
						}scan.close();
						sc.close();
						break;
						
					}if(select > size){
						System.out.println("Select number from 1 to "+size);
						//Selection(size);
						continue;
				}
			}	
		}
		}if(file.exists() == false) {
				throw new FileNotFoundException("Directory "+"'"+listfile+"'"+" is not found.");
				
			}

			
			}catch(Exception e){ 
			System.out.println(e.getMessage());
			
		}
	}
			

	
	public static void Selection(int Size) {
			String sizes = String.valueOf(Size);
			throw new IndexOutOfBoundsException("Select number from 1 to "+sizes);
		}
	}
	



