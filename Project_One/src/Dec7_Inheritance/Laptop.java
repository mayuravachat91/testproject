package Dec7_Inheritance;

public class Laptop {
	
	int noOfUSBPort;
	int processorSpeed;
	
	
	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}


	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}


	public int getProcessorSpeed() {
		return processorSpeed;
	}


	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}


	public static void main(String[] args) {
		
		Laptop l=new Laptop();
		l.setNoOfUSBPort(4);
		l.setProcessorSpeed(2);
		
		System.out.println("No.Of USB Ports:"+l.getNoOfUSBPort()+" Processor Speed:"+l.getProcessorSpeed());

	}

}
