package designpatterns.abstractfactory;

//This is the Factory Layer for the Client
public class ComputerFactory {
	public static ComputerAbstractClass getComputer(ComputerAbstractFactory comp) {
		return comp.createComputer();
	}
}
