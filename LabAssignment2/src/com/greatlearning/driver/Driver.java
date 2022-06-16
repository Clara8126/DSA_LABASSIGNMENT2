package com.greatlearning.driver;
import java.util.Scanner;

import com.greatlearning.service.MergeSortImplementation;
import com.greatlearning.service.NotesCount;

public class Driver {
	
	public static void main (String []agrs) {
		
		
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
	    NotesCount notesCount = new NotesCount();
	 
	    
	    System.out.println(" Enter the size of the currency denominations");
	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    int[] notes = new int[size];
	    System.out.println("Enter the curreny denominations value");
	    for (int i = 0 ; i < size ; i ++) {
	    	notes[i] = sc.nextInt();
	    }
	    
	    System.out.println("Enter the amount you want to pay ");
	    int amount = sc.nextInt();
	    mergeSortImplementation.sort(notes,0,notes.length-1);
	    notesCount.notesCountImplementation(notes, amount);
	    
	}
	
	

}
