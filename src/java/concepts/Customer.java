package java.concepts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
@AllArgsConstructor
//@ToString
//@Getter
//@Setter

@Data

public class Customer {
	
	private String name;
	private int age;
	private String city;
	private boolean isActive;
	private String dob;
	
	
	
	
	
//	public Customer(String name, int age, String city, boolean isActive, String dob) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.city = city;
//		this.isActive = isActive;
//		this.dob = dob;
//	}
//	
//	public Customer() {
//		
//		
//	}
//	public String getName() {
//		return name;
//	}
//	@Override
//	public String toString() {
//		return "Customer [name=" + name + ", age=" + age + ", city=" + city + ", isActive=" + isActive + ", dob=" + dob
//				+ "]";
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public boolean isActive() {
//		return isActive;
//	}
//	public void setActive(boolean isActive) {
//		this.isActive = isActive;
//	}
//	public String getDob() {
//		return dob;
//	}
//	public void setDob(String dob) {
//		this.dob = dob;
//	}
//	private boolean isActive;
//	private String dob;

}
