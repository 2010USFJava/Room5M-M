package com.revature.driver;

import com.revature.beanz.Leaf;
import com.revature.beanz.Tree;

public class Driver {

	public static void main(String[] args) {
		System.out.println("michelle branch");
		Leaf charlie = new Leaf("orange", "maple",5);
		System.out.println(charlie);
		
		Tree mary = new Tree("oak", 35, 5, charlie);
		System.out.println(mary);
	

	}

}
