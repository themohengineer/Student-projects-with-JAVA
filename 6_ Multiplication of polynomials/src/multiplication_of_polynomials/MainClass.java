package multiplication_of_polynomials;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;


import javax.swing.text.html.HTMLDocument.Iterator;

public class MainClass {

	public static void main(String[] args) {
		
				          Scanner inputquestion=new Scanner(System.in);



			    //--------------  Read Input from File.------------------------------------------------------------


			            String content = new String();
			            String name = new String();
			            File file = new File("D:\\polyinput.txt");
			            
			            LinkedList<String> list = new LinkedList<String>();

			            try {
			            	file.createNewFile();
			                Scanner sc = new Scanner(new FileInputStream(file));
			                    while (sc.hasNext()) {
			                    name = sc.next();
			                    content = sc.nextLine();
			                    list.add(content);

			                }

			                sc.close();
			            } catch (FileNotFoundException fnfe) {
			                fnfe.printStackTrace();
			            } catch (Exception e) {
			                e.printStackTrace();
			                System.out.println("\nProgram terminated Safely...");
			            }

			            java.util.Iterator<String> i = list.iterator();
			            while (i.hasNext()) {
			                System.out.println(name + i.next() + "\n");

			            }


			        } //------------ End if to enter input text file code---------------------------------------



	
		
		
	}


