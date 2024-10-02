package studio4;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		
		StdDraw.clear();
		StdDraw.setPenColor(0,0,250);
		StdDraw.filledRectangle(3.5, 5, 3.5, 11);
		
		StdDraw.setPenColor(250,0,0);
		StdDraw.filledRectangle(18.5, 5, 3.5, 11);
		
		// TODO
	}

	public static void indonesia() {
		
		StdDraw.clear();
		StdDraw.setPenColor(250,0,0);
		StdDraw.filledRectangle(11, 12, 11, 4);
		
		
		// TODO
	}

	public static void netherlands() {
		
		StdDraw.clear();
		StdDraw.setPenColor(250,0,0);
		StdDraw.filledRectangle(11, 13, 11, 3);
		
		StdDraw.setPenColor(0,0,250);
		StdDraw.filledRectangle(11, 3, 11, 3);
		
		// TODO
	}

	public static void poland() {
		
		StdDraw.clear();
		StdDraw.setPenColor(250,0,0);
		StdDraw.filledRectangle(11, 11.5, 11, 4.5);
		
		// TODO
	}

	public static void thailand() {
		
		StdDraw.clear();
		StdDraw.setPenColor(250,0,0);
		StdDraw.filledRectangle(11, 15, 11, 1);
		StdDraw.filledRectangle(11, 1, 11, 1);
		
		StdDraw.setPenColor(0,0,250);
		StdDraw.filledRectangle(11, 8, 11, 2);
		
		// TODO
	}

	public static void finland() {
		
		StdDraw.clear();
		StdDraw.setPenColor(0,0,250);
		StdDraw.filledRectangle(7, 8, 2, 11);
		StdDraw.filledRectangle(11, 8, 11, 2);
		// TODO
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}
