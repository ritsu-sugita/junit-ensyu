package junit.tutorial.ex02.e02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String firstName;
	private String lastName;
	private String email;
	
	public static List<Employee> load(InputStream input) {
		List<Employee> empList = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] items = line.split(",");
				Employee emp = new Employee();
				emp.setFirstName(items[0]);
				emp.setLastName(items[1]);
				emp.setEmail(items[2]);
				empList.add(emp);
			}
			return empList;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
