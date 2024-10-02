package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setScale(0,10);
		
		StdDraw.setPenColor(173, 216, 250);
		StdDraw.filledRectangle(5,5,5,5);
		
		StdDraw.setPenColor(Color.BLUE);
		
		StdDraw.filledRectangle(2, 5, 0.5, 5);
		StdDraw.filledRectangle(4, 5, 0.5, 5);
		StdDraw.filledRectangle(6, 5, 0.5, 5);
		StdDraw.filledRectangle(8, 5, 0.5, 5);
		
		StdDraw.filledRectangle(5, 2, 5, 0.5);
		StdDraw.filledRectangle(5, 4, 5, 0.5);
		StdDraw.filledRectangle(5, 6, 5, 0.5);
		StdDraw.filledRectangle(5, 8, 5, 0.5);
		
		
		StdDraw.setPenColor(165, 42, 42);
		StdDraw.filledRectangle(5,4.5,1,3);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(5, 6, 2);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(5,6,"Honor and Glory");
		
		
	}
}