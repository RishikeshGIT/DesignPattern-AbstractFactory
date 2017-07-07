package designpatterns.abstractfactory;

public abstract class ComputerAbstractClass {
	private String hardDisk;
	private String memory;
	
	public abstract String getHardDiskSize();
	public abstract String getMemorySize();
	
	public String toString() {
		return "The Hard Disk capacity is "+this.getHardDiskSize()+" and the Memory size is "+this.getMemorySize();
	}
}
