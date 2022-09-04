package Pract1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		Scanner abs = new Scanner(System.in);
		
		List<Integer>mydata = new ArrayList<Integer>();
		
		Random randNum = new Random();
		Random rand = new Random();
		
		for (int i=0;i<500;i++) {
			
			int randomNumbers =rand.nextInt(100,900);
			mydata.add(randomNumbers);
		}
		
		Collections.sort(mydata);
		System.out.println(mydata);
		System.out.println("User pls enter Nth Number");
		int NthNumber=abs.nextInt();
		
		System.out.println("The " + NthNumber + "th smallest number is "+mydata.get(NthNumber-1));

	}

}
