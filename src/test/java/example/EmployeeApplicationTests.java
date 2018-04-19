package example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeApplicationTests {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	public void employeeTest() {
		Employee e = employeeRepository.save(new Employee("Jon Snow"));
		
		long id = e.getId();
		
		e = employeeRepository.findById(id).get();
		
		assertEquals("Jon Snow", e.getName());
	}
}
