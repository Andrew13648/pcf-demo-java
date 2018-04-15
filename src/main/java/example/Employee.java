package example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	Employee() {

	}

	public Employee(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "=" + name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
