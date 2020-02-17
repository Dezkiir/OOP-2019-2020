package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	

	//float[] rainfall = new float[12];
	float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};	// This works as there are no truncation between the integer values in array to float
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	
	String maximumMonth = "";
	String minimumMonth = "";
	float maximumRain = 0;
	float minimumRain = 0;

	public void rainfallCalc()
	{
		for(int index = 0; index <= 12; index++)
		{
			if(rainfall[index] < rainfall[index+1])
			{
				maximumRain = rainfall[index+1];
				minimumRain = rainfall[index];
				maximumMonth = months[index+1];
				minimumMonth = months[index];
			}
			else
			{
				maximumRain = rainfall[index];
				minimumRain = rainfall[index+1];
				maximumMonth = months[index];
				minimumMonth = months[index+1];
			}
		}
		println(maximumMonth + maximumRain);
		println(minimumMonth + minimumRain);
	}

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		// Iterating over the array using an index
		for(int i = 0; i < rainfall.length; i++)
		{
			//println is in the superclass so you don't need the full shebang
			println(months[i] + "\t" + rainfall[i]);
		}
		// Iterating over the array
		for(float f:rainfall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}
	}

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
	}
}
