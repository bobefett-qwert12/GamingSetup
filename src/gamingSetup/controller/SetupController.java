package gamingSetup.controller;

import gamingSetup.model.GamingSetup;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class SetupController
{
	private GamingSetup[] setupArray;
	private GamingSetup[] gamingArray;
	private ImageIcon[] icons;

	public SetupController()
	{
		setupArray = new GamingSetup[5];
		gamingArray = new GamingSetup[10];
		icons = new ImageIcon[6];
		icons[0] = new ImageIcon(getClass().getResource("/gamingSetup/view/images/BobRossMeme.jpg"));
		icons[1] = new ImageIcon(getClass().getResource("/gamingSetup/view/images/canHaz.jpeg"));
		icons[2] = new ImageIcon(getClass().getResource("/gamingSetup/view/images/rarePepe.jpeg"));
		icons[3] = new ImageIcon(getClass().getResource("/gamingSetup/view/images/RyanPerkins.png"));
		icons[4] = new ImageIcon(getClass().getResource("/gamingSetup/view/images/thisIsFine.jpeg"));
		icons[5] = new ImageIcon(getClass().getResource("/gamingSetup/view/images/UIViewPersonal.png"));
	}

	public void start()
	{
		ArrayList<GamingSetup> setupList = buildAList();
		arrayInitialization();
		JOptionPane.showMessageDialog(null, "Here are the monitor counts for each setup:");
		int count = 1;
		for (GamingSetup setup : setupList)
		{
			JOptionPane.showMessageDialog(null, "Gaming Setup #" + count + " has " + setup.getMonitorCount() + " monitor(s).");
			count++;
		}
		JOptionPane.showMessageDialog(null, "Here are the GPU speeds for each setup:");
		for (int i = 0; i < setupList.size(); i++)
		{
			JOptionPane.showMessageDialog(null, "Gaming Setup #" + (i + 1) + " has a GPU that runs at " + setupList.get(i).getGpuSpeed() + " gigabits per second.");
		}
		JOptionPane.showMessageDialog(null, "And finally, here are the RAM capacities for each setup:");
		for (int i = 0; i < setupList.size(); i++)
		{
			JOptionPane.showMessageDialog(null, "Gaming Setup #" + (i + 1) + " has " + setupList.get(i).getRamSpace() + " gigabytes of RAM.");
		}
	}

	private void arrayInitialization()
	{
		JOptionPane.showMessageDialog(null, "This town ain't big enough for the two of us (-.-)", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[2]);
		
		JOptionPane.showMessageDialog(null, "Bob Ross is God incarnate.", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[0]);
		
		JOptionPane.showMessageDialog(null, "Lookit this cat:", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[1]);
		
		JOptionPane.showMessageDialog(null, "Lookit this octocat:", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[3]);
		
		JOptionPane.showMessageDialog(null, "Here, have an original meme.", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[4]);
		
		JOptionPane.showMessageDialog(null, "I made this:", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[5]);
		
		for(int i = 0; i < gamingArray.length; i++) {
			if(i % 2 == 1)
			{
				gamingArray[i] = new GamingSetup();
			}else {
				gamingArray[i] = new GamingSetup((i*15016) % 7, i*150 + 100, (i*6000) % 1973);
			}
		}
		for(int j = 0; j < setupArray.length; j++) {
			if(j % 3 == 1) {
				setupArray[j] = new GamingSetup();
			} else {
				setupArray[j] = new GamingSetup();
			}
		}
	}

	public ArrayList<GamingSetup> buildAList()
	{
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
