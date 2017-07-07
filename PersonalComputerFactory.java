package designpatterns.abstractfactory;

public class PersonalComputerFactory implements ComputerAbstractFactory {
	
	String hdd;
	String memory;
	
	public PersonalComputerFactory (String hdd, String memory) {
		this.hdd = hdd;
		this.memory = memory;
	}
	
	public PersonalComputer createComputer(){
		return new PersonalComputer(hdd, memory);
	}
}
