package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int R = in.nextInt();
		int G = in.nextInt();
		int B = in.nextInt();
		boolean filled = in.nextBoolean();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double r1 = in.nextDouble();
		double r2 = in.nextDouble();
		if (shape.equals("ellipse")) {
			StdDraw.setPenColor(R,G,B);
			StdDraw.ellipse(x1,y1,r1,r2);
			
			if (filled) {
				StdDraw.filledEllipse(x1, y1, r1, r2);
			}
		}
	}
}
