package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.line(0.3, 0.1, 0.8, 0.8);
		StdDraw.line(0.1, 0.3, 0.8, 0.8);
		StdDraw.line(0.3, 0.1, 0.1, 0.3);
		StdDraw.ellipse(0.87, 0.87, 0.1, 0.1);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.line(0.9, 0.3, 0.2, 0.8);
		StdDraw.line(0.7, 0.1, 0.2, 0.8);
		StdDraw.line(0.9, 0.3, 0.7, 0.1);
		StdDraw.ellipse(0.13, 0.87, 0.1, 0.1);
	}
}