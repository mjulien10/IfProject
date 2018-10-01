package controller;

import javax.swing.JOptionPane;

public class Controller 
{

	

		public Controller()
		{
			
		}
		
		
		public void start()
		{
			loopy();
			
		}
		
		private void loopy()
		{
			
			int count = 0;
			
			while (count < 15)//Test the variable
			{
				JOptionPane.showMessageDialog(null, "henlo ");
				//Eventually change the loop variable
				count++;
			}
			
			for (int loop = 0; loop < 30; loop += 2)
			{
				JOptionPane.showMessageDialog(null, "The monky value is: " + loop);
			}
		}
			private void askUser()
			{
				
				String response = JOptionPane.showInputDialog(null, "What is the monky?");
				
				while (!validDouble(response))
				{
					response = JOptionPane.showInputDialog(null, "No!, type in a valid monky cuz basicaly im monky");
				}
	
		}
		
	
			public boolean validInt(String maybeInt)
			{
				boolean isValid = false;
				
				try
				{
					Integer.parseInt(maybeInt);
					isValid = true;
				}
				catch(NumberFormatException error)
				{
					JOptionPane.showMessageDialog(null, "Please type an integer value goofy head");
				}
				return isValid;
			}
			
			public boolean validDouble(String maybeDouble)
			{
				boolean isValid = false;
				
				try
				{
					Double.parseDouble(maybeDouble);
					isValid = true;
				}
				catch(NumberFormatException error)
				{
					JOptionPane.showMessageDialog(null, "Please type a double value monky");
				}
				return isValid;
			}
		
}
