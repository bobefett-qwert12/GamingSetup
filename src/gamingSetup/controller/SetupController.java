package gamingSetup.controller;

import gamingSetup.model.GamingSetup;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SetupController
{
	private GamingSetup[] setupArray;
	private GamingSetup[] gamingArray;
	
	public SetupController()
	{
		setupArray = new GamingSetup[5];
		gamingArray = new GamingSetup[10];
	}
	
	public void start() {
		ArrayList<GamingSetup> setupList = buildAList();
		JOptionPane.showMessageDialog(null, "Here are the monitor counts for each setup:");
		int count = 1;
		for(GamingSetup setup : setupList) {
			JOptionPane.showMessageDialog(null, "Gaming Setup #" + count + " has "
					+ setup.getMonitorCount() + " monitor(s).");
			count ++;
		}
		JOptionPane.showMessageDialog(null, "Here are the GPU speeds for each setup:");
		for(int i = 0; i < setupList.size(); i++) {
			JOptionPane.showMessageDialog(null, "Gaming Setup #" + (i + 1) + " has a GPU that runs at "
					+ setupList.get(i).getGpuSpeed() + " gigabits per second.");
		}
		JOptionPane.showMessageDialog(null, "And finally, here are the RAM capacities for each setup:");
		for(int i = 0; i < setupList.size(); i++) {
			JOptionPane.showMessageDialog(null, "Gaming Setup #" + (i + 1) + " has "
					+ setupList.get(i).getRamSpace() + " gigabytes of RAM.");
		}
	}
	
	public ArrayList<GamingSetup> buildAList(){
		ArrayList<GamingSetup> objectList = new ArrayList<GamingSetup>();
		GamingSetup setup1 = new GamingSetup();
		GamingSetup setup2 = new GamingSetup(2, 1000, 1000);
		GamingSetup setup3 = new GamingSetup(3, 1200, 1500);
		
		objectList.add(setup1);
		objectList.add(setup2);
		objectList.add(setup3);
		return objectList;
	}
}
