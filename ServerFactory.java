package designpatterns.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {
	String hdd;
	String memory;
	
	public ServerFactory(String hdd, String memory){
		this.hdd = hdd;
		this.memory = memory;
	}
	
	public Server createComputer(){
		return new Server(hdd, memory);
	}
}
