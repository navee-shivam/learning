package com.demo.prepare;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEqualsTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(5);
		Employee e2 = new Employee(5);
		Map<Employee, String> hashMap = new HashMap<Employee, String>();
		hashMap.put(e1, "Navee");
		hashMap.put(e2, "Navee");

		System.out.println(hashMap.size());

		System.out.println("equals : " + e1.hashCode());
		System.out.println("equals : " + e2.hashCode());
		System.out.println(e1.equals(e2));
	}
}

class Employee {
	private int id;

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
