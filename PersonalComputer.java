package designpatterns.abstractfactory;

public class PersonalComputer extends ComputerAbstractClass {

	private String hardDisk;
	private String memory;
	
	public PersonalComputer(String hdd, String memory) {
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
