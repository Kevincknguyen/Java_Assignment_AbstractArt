package com.art.vague;
import java.util.ArrayList;
import java.util.Random;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		Painting painting1=new Painting("Art","Who","Arttt","Paint");
		Painting painting2=new Painting("Superart","What","AAAAARRRTTT","Oil");
		Painting painting3=new Painting("Kidart","Baby","hmm","Crayons");
		Sculpture sculpture1=new Sculpture("Sculpture","He","sculp","Marble");
		Sculpture sculpture2=new Sculpture("Supersculpture","She","sculpted","Bronze");
		Sculpture sculpture3=new Sculpture("Greatsculpture","Them","sculper","Gold");
		
		
		painting1.getAllInfo();
		painting2.getAllInfo();
		sculpture1.getAllInfo();
		sculpture2.getAllInfo();
		sculpture3.getAllInfo();
		
		
		
		
		ArrayList<Art> museum =new ArrayList<Art>();
		System.out.println(museum);
		museum.add(painting1);
		museum.add(painting2);
		museum.add(painting3);
		museum.add(sculpture1);
		museum.add(sculpture2);
		museum.add(sculpture3);
		
		
		
		System.out.println(museum);
		
		ArrayList<Integer> checker =new ArrayList<Integer>();
		Random random= new Random();
		int i=0;
		
		System.out.println(museum.size());
		
		while (i<museum.size()) {
			int randNumber=random.nextInt(museum.size());
			if (!checker.contains(randNumber)) {
				System.out.println(randNumber);
				museum.get(randNumber).viewArt();
				checker.add(randNumber);
				i++;
			}
			else {
				
			}
			
		}
		System.out.println("Its over");
		
	}

}
