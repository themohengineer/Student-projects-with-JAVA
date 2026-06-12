

import java.util.*;
public class MainClass {
static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		ImplementationBST t1 = new ImplementationBST();
		System.out.print("number of nodes : ");
		int x=in.nextInt();
		
		for(int i=0 ; i<x ; i++)
		{
			t1.add();
			System.out.print("\n");
		}
		
	//for exampele
		t1.deleteNode("Ali", 14 , 971120027 , 19);
		System.out.print("\n names : ");
		t1.traversePreOrder(t1.getRoot());
	}

}
