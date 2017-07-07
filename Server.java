package designpatterns.abstractfactory;

public class Server extends ComputerAbstractClass {
	private String hardDisk;
	private String memory;
	
	public Server(String hdd, String memory){
		this.hardDisk = hdd;
		this.memory = memory;
	}
	
	public String getHardDiskSize() {
		return this.hardDisk;
	}
	public String getMemorySize() {
		return this.memory;
	}
}
