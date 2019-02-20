package ie.dit; 

import processing.core.PApplet;

public class Arrays extends PApplet
{
    float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
    String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};


    // new is used to instantiate a new object

    float[] fa = new float[2];


    public void settings()
    {
        size(500,500);

    }

    public void setup()
    {
        fa[0] = 10; 
        fa[1] = 4;



        System.out.println(fa[0]);
        //System.out.println(fa[2]); 

        // Iterate through an array.
        for(int i= 0; i < rainfall.length; i++)
        {
            System.out.println(months[i] + "\t" + rainfall[i]);
        }

        // Rainfall is an array of values and is copied through f and prints the values.
        for(float f:rainfall)
        {
            System.out.println(f);
        }

        // Calculating the amount of rainfall for the year
       float total = 0;
       for(float f:rainfall)
       {
           total = total + f;
       }
       System.out.println("Total + " + total);

       // same foor loop()
       total = 0;
       for ( int i = 0; i < rainfall.length; i++)
       {
        total = total + rainfall[i];
       }
       // Calculating the average.
       float average = total / (float) rainfall.length;
       System.out.println(average);

       // Calculating the maximum rainfall a month has.
    
     
       // float max = rainfall[0];
        int maxIndex = -1;

    //    for(int i = 1; i < rainfall.length; i++)
    //    {
    //         if(rainfall[i] > max)
    //         {
    //             max = rainfall[i];
    //             maxIndex = i;
    //         }
    //    }

       // Another way of writing the max value.
       // assign max to the most minimum value.
       float max = Float.MIN_VALUE;
       for(int i = 1; i < rainfall.length; i++)
       {
        if(rainfall[i] > max)
        {
            max = rainfall[i];
            maxIndex = i;
        }
       }

       System.out.println(months[maxIndex] + 
       " had the highest rainfall of " 
       + rainfall[maxIndex]);

       float min = Float.MAX_VALUE;
       int minIndex = -1;
       for(int i = 0; i < rainfall.length; i++ )
       {
           if(rainfall[i] < min)
           {
               min = rainfall[i];
               minIndex = i;
           }
       }


       System.out.println(months[minIndex] + 
       " had the lowest rainfall of " 
       + rainfall[minIndex]);

    // Rainfall chart.
      float barheight = height / (float) rainfall.length;;
     // println(barheight);

       colorMode(HSB);
       textAlign(LEFT,CENTER);

       //float h = height / (float) rainfall.length;
       for(int i = 0; i < rainfall.length; i++)
       {
           noStroke();
           fill(random (0, 255), 255, 255);
           rect(0, i * barheight, rainfall[i] * 2, barheight);
           fill(0);
           //text(months[i], 20, i * barheight, i);
           
          // float textY = i * barheight + (barheight * 0.5f);
           float textY = map(i, 0, rainfall.length, barheight * 0.5f, height + (barheight * 0.5f));
           text(months[i], 5,textY);
        
            // map(x, r0, r1, r2, r3);
            // takes x from r0 to r1 and maps to r2 and r3;
            // map ( 3 , 0, 10, 100, 200); and returns 130.

            int m = mouseY /rainfall.length;
            
            fill(0);
            text(rainfall[m], 400, 300);

       }

  }

    
    public void draw()
    {

    }
}