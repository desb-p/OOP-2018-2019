package ie.dit;

import processing.core.PApplet;
import java.util.Arrays;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		colorMode(HSB);
		dx = 0;
		dy = 0;
		cx = width / 2;
		cy = height / 2;

	}

	/*
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
	*/

	int x = 0; // 4 bytes
	int xx = 2;
	float f = 0.0f; // 4 bytes
	char c = 'h'; // Unicode
	String s = "Hello";
	boolean b = (1 == 0);
	double d = 0; // 8 bytes

	// public void drawFace(float x, float y, float w)
	// {
	// 	ellipse(x, y, w, w);
	// 	ellipse(x - 10, y - 10, 10, 10);
	// 	ellipse(x + 10, y - 10, 10, 10);
	// 	line(x, y - 5, x, y + 5);
	// 	line(x - 10, y + 20, x + 10, y + 20);
	// 	line(x - 10, y + 20, x - 15, y + 15);
	// 	line(x + 10, y + 20, x + 15, y + 15);		
	// }

	float dx, dy;
	float cx, cy;

	public void loops()
	{
		/*
		int lines = 0;
		float gap = height / 10;
		while(lines < 10)
		{
			float y = gap * lines;
			line(0, y, width, y);
			lines ++;
		}
		*/

		/*
		float y = 0;
		float gap = height / 10;
		while (y < height)
		{
			line(0, y, width , y);
			y += gap;
		}
		*/

	// 	float gap = height / 10;
	// 	for(int lines = 0; lines < 10 ; lines++)
	// 	{
	// 		line(0, lines * gap, width, lines * gap);
	// 	}
	}

	void loops1()
	{
		// int numLines = 20;
		// float gap = width / numLines;

		// for(int l = 0 ; l <= numLines; l ++)
		// {
		// 	float x = l * gap;
		// 	line(x, 0, width - x, height);

		// 	line(1, x, width, height - x);
		// }
		// int circles = 10;
		// float diameter = width/circles; // diameter is the distance between the circles.
		// float y = height/2; // draw the ellipses in center of screen.
		// float x = diameter/2;

		// for(int i =0 ; i < circles; i++)
		// {
		// 	ellipse(x, y, diameter, diameter);
		// 	x = x + diameter;
		// }


		// ellipse(25,60,70,100);
		// ellipse(75,60,70, 100);
		// ellipse(75,70,70,100);
		// ellipse(175,70,70,100);
		// ellipse(125,70,70,100);
		// ellipse(125,70,70,100);
		// ellipse(125,70,70,100);
		// ellipse(125,70,70,100);
		
		// RECTANGULAR RAINBOW
		// int rectCount = 10;
		// float w = width /rectCount;

		// float colorGap = 255 / rectCount;

		// for(int = 0; i < rectCount; i++)
		// {
		// 	fill(colorGap * i, 255, 255);
		// 	rect( i * w, w, height);
		// }


	}


	// void loops2()
	// {
		// color circless
	// 	int numCircles = 1; 
	// 	float diameter = width / numCircles;
	// 	float radius = diameter / 2;
	// 	noStroke();
	// 	//stroke(255);
	// 	noFill();
	// 	colorMode(HSB);
	// 	float colorGap = 255 / numCircles;

	// 	for(int i = 0; i < numCircles; i++)
	// 	{
	// 		fill(i * colorGap, 255, 255);
	// 		float x = radius + (i * diameter);
	// 		float y = height / 2;
	// 		ellipse(x, y, diameter, diameter);
	// 	}
	// }

	
	// void loops3()
	// {

		
	// 	int numCircles = 17; 
	// 	float diameter = width / (float) numCircles;
	// 	float radius = diameter / 2.0f;
	// 	noStroke();
	// 	//stroke(255);
	// 	noFill();
	// 	colorMode(HSB);
	// 	float colorGap = 255 / numCircles;

	// 	for(int j = 0; j < numCircles; j++)
	// 	{
	// 		for(int i = 0; i < numCircles; i++)
	// 		{
		//fill(((i + j) / 2 ) * colorGap, 255, 255);
	// 			fill(i * colorGap, 255, 255);
	// 			float x = radius + (i * diameter);
	// 			float y = radius + (y * diameter);
	// 			
	// 			ellipse(x, y, diameter, diameter);
	// 		}
	// 	}
	// }

	void loops4()
	{
		// blue rectangles.
		int numRects = 10; 
		float w = width / (float) numRects;
		stroke (255);
		//noStroke();
		colorMode(RGB);
		
		for(int i = 0; i < numRects; i++)
		{
			for(int j = 0; j < numRects; j++)
			{
				//int b = ( i + j) % 2 == 0  ? 255 : 127;
				//fill(0, 0, b);
				float x = w * j;
				float y = w * i;
				rect (x , y, w,  w );
				

			}
		}

	}

	void problem1()
	{
		int numLines = 20;
		float gap = width / numLines;

		for(int l = 0 ; l <= numLines; l ++)
		{
			float x = l * gap;
			line(x, 0, width - x, height);
			line(0, x, width, height - x);
			
		}
	}

	void problem2()
	{
		noFill();
		int numCircles = 10;
		float diameter = width / numCircles;
		float radius = diameter / 2;

		for(int i = 0 ; i < numCircles ; i ++)
		{
			float x = radius + (i * diameter);
			// This is another nice way tocalculate x
			//x = map(i, 0, numCircles, radius, width + radius);
			ellipse(x, height * .2f, diameter, diameter);
		}
	}

	void problem4()
	{
		colorMode(HSB);
		noStroke();
		int numCircles = 10;
		float diameter = width / numCircles;
		float radius = diameter / 2;

		float colorgap = 255 / numCircles;
		for(int i = 0 ; i < numCircles ; i ++)
		{
			float x = radius + (i * diameter);
			// This is another nice way tocalculate x
			//x = map(i, 0, numCircles, radius, width + radius);
			fill(i * colorgap, 255, 255);
			ellipse(x, height * 0.4f, diameter, diameter);
		}
	}

	void problem3()
	{
		colorMode(HSB);
		noStroke();		

		float numBoxes = 10;
		float colorGap = 255 / numBoxes;
		float gap = width / numBoxes;
		for(int box = 0 ; box < numBoxes ; box ++)
		{
			fill(colorGap * box, 255, 255);
			rect(box * gap, 0, gap, height);
		}
	}

	void problem5()
	{
		colorMode(HSB);
		noStroke();
		int numCircles = 10;
		float diameter = width / numCircles;
		float radius = diameter / 2;

		float colorgap = 255 / numCircles;
		// Nested loop
		for(int i = 0 ; i < numCircles ; i ++)
		{
			for(int j = 0 ; j < numCircles ; j ++)
			{
				float x = radius + (i * diameter);
				float y = radius + (j * diameter);
				fill((i + j) * colorgap * 0.5f, 255, 255);
				ellipse(x, y, diameter, diameter);
			}
		}
	}

	void problem6()
	{
		colorMode(RGB);
		noStroke();
		int gridSize = 10;
		float w = width / gridSize;		
		// Nested loop
		for(int i = 0 ; i < gridSize ; i ++)
		{
			for(int j = 0 ; j < gridSize ; j ++)
			{
				float x = i * w;
				float y = j * w;
				// One possible way!
				int b = ((i + j) % 2 == 0) ? 255 : 127;
				// Another way would be to use a boolean variable
				fill(0, 0, b);
				rect(x, y, w, w);
			}
		}
	}


	public void draw()
	{			
		background(255);
		stroke(0); // colour of lines.
		noFill();	

		/*
		// Examples
		drawFace(cx + dx, cy + dy, 70);
		drawFace(cx + dx, cy -dy, 70);
		drawFace(cx - dx, cy + dy, 70);
		drawFace(cx - dx, cy -dy, 70);

		dx ++;
		dy ++;
		loops();
		*/

		// Lab problems...		
		//problem1();
		//problem2();
		//problem3();
		//problem4();
		problem5();
		//problem6();
	}

}
