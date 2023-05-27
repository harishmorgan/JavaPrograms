package java.concepts;

import java.util.HashSet;
import java.util.Set;

public class HowToFindDuplicatesElementsInJavaArray {

	public static void main(String[] args) {
		
		String names[]= {"java","c","c++","selenium","cypress","cypress"};
		
		//1. O(n2)--worst case when they are was case like 10000 of elements
		for(int i =0; i<names.length;i++) {
			for(int j = i+1; j<names.length;j++) {
				
				if(names[i].equals(names[j])) {
					
					System.out.println("duplicate elements is ::"+names[i]);
				}
				
			}
		}
		
		System.out.println("------------------------------");
		//2.HashSet : JavaCollections(stores unique elements) --O(n)
		
		Set<String>store = new HashSet<String>();
		
		for(String name: names) {
			if(store.add(name)== false) {
				
				System.out.println("duplicate elements is :: "+name);
			}
		}
		
		//3.Using HashMap
		
		
		
		

	}

}
