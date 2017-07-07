package designpatterns.abstractfactory;

public class AbstractFactoryDemoClass {

	public static void main(String[] args) {
		ComputerAbstractClass pc = ComputerFactory.getComputer(new PersonalComputerFactory("500 GB", "12 GB"));
		System.out.println(pc);
		
		ComputerAbstractClass ser = ComputerFactory.getComputer(new ServerFactory("1000 GB", "120 GB"));
		System.out.println(ser);
	}
}
