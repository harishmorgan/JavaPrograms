package java.concepts;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student("Tom", 1, 90, 15);
		Student s2 = new Student("Peter", 2, 80, 16);
		Student s3 = new Student("Lisa", 3, 95, 17);
		Student s4 = new Student("Robby", 4, 100, 15);
		Student s5 = new Student("Naveen", 5, 50, 14);
		
		//add all the student objects to the ArrayList:
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		System.out.println("total students: "+ studentList.size());
		
		for(Student s: studentList) {
			System.out.println(s); 
			
			/* Before adding toString method we get in console asmay.practices.Student@34a245ab
			* may.practices.Student@7cc355be
			* may.practices.Student@6e8cf4c6
			* may.practices.Student@12edcd21
			* may.practices.Student@34c45dca */
			
			/* After adding toString method we get in console as 
			 * Student [name=Tom, rollNum=1, marks=90, age=15]
			 * Student [name=Peter, rollNum=2, marks=80, age=16]
			 * Student [name=Lisa, rollNum=3, marks=95, age=17]
			 * Student [name=Robby, rollNum=4, marks=100, age=15]
			 * Student [name=Naveen, rollNum=5, marks=50, age=14]
			 														*/

		}
		
		studentList.stream().forEach(e-> System.out.println(e));
		
		/* Student [name=Tom, rollNum=1, marks=90, age=15] 
		 * Student [name=Peter, rollNum=2, marks=80, age=16]
		 * Student [name=Lisa, rollNum=3, marks=95, age=17]
		 * Student [name=Robby, rollNum=4, marks=100, age=15]
		 * Student [name=Naveen, rollNum=5, marks=50, age=14] */

		//names where marks>80
		System.out.println("-----names where marks>80-----");
		studentList.stream().filter(e -> e.getMarks()>80).forEach(e -> System.out.println(e.getName() + ":"+e.getMarks()));
		
		/* -----names where marks>80-----
		 * Tom:90
		 * Lisa:95
		 * Robby:100 */
		
		//name who got the highest marks:
		
		int highest = studentList.stream()
				.map(ele->ele.getMarks())
				.max(Integer:: compare)
				.get();
		
		System.out.println("Highest marks is:"+highest); // Highest marks is:100
		
		 studentList.stream().filter(e->e.getMarks()==highest).forEach(e->System.out.println(e)); //Student [name=Robby, rollNum=4, marks=100, age=15]
		
		

	}

}
