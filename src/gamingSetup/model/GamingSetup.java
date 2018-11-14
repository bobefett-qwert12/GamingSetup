package gamingSetup.model;

public class GamingSetup
{
	private int monitorCount;
	private int gpuSpeed; //in megahertz
	private double ramSpace; //in gigabytes
	
	public GamingSetup() {
		this.monitorCount = 1;
		this.gpuSpeed = 600;
		this.ramSpace = 5;
	}
	
	public GamingSetup(int monitorCount, int gpuSpeed, double ramSpace) {
		this.monitorCount = monitorCount;
		this.gpuSpeed = gpuSpeed;
		this.ramSpace = ramSpace;
	}
	
	public int getMonitorCount() {
		return this.monitorCount;
	}
	
	public int getGpuSpeed() {
		return this.gpuSpeed;
	}
	
	public double getRamSpace() {
		return this.ramSpace;
	}
}
