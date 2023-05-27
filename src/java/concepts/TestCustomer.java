package java.concepts;

public class TestCustomer {

	public static void main(String[] args) {
		
//		Customer external = new Customer();
//		external.setName("HDFC");
//		external.setAge(1974);
//		external.setCity("Kurnool");
//		external.setDob("17/05/2023");
//		
//		System.out.println(external.getName());
		
      Customer Internal = new Customer("HDFC",1974,"Kurnool",true, "17/05/2023");
      System.out.println(Internal); // Customer(name=HDFC, age=1974, city=Kurnool, isActive=true, dob=17/05/2023)
      System.out.println(Internal.getName() + Internal.getDob()); // HDFC17/05/2023
      Internal.setActive(false);
      System.out.println(Internal.isActive()); //false

	}

}
