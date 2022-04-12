package FlyWeightDesignPattern;

import java.util.HashMap;

//create object once but parameters of object can be change 
interface Employee{
	public void assignSkill(String skill);
	public void task();
}
class Developer implements Employee{
	private String skill;
	@Override
	public void assignSkill(String skill) {
		this.skill=skill;
	}

	@Override
	public void task() {
		System.out.println("Developer task"+skill);
	}
	
}
class Tester implements Employee{
	private String skill;
	@Override
	public void assignSkill(String skill) {
		this.skill=skill;
	}

	@Override
	public void task() {
		System.out.println("Tester task"+skill);
	}
}

class EmployeeFactory{
	private static HashMap<String,Employee> m=new HashMap<String,Employee>();
	public static Employee  getEmployee(String emp) {
		Employee p=null;
		if(m.get(emp)!=null) {
			p=m.get(emp);
		}else {
			switch(emp) {
			case "developer":
				System.out.println("developer created");
				p=new Developer();
				m.put(emp, p);
				break;
			case "tester":
				System.out.println("Tester created");
				p=new Tester();
				m.put(emp, p);
				break;
			default:System.out.println("no such type");
			}	
		}
		return p;
	}
}
public class FlyWeightDesignPattern {
	public static void main(String[] args) {
		//EmployeeFactory ef=new EmployeeFactory();
		Employee e=EmployeeFactory.getEmployee("developer");
		e.assignSkill("java");
		e.task();
		Employee e1=EmployeeFactory.getEmployee("developer");
		e1.assignSkill("c++");
		e1.task();
	}
}
