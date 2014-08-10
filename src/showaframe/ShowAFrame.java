package showaframe;
import javax.swing.*;


public class ShowAFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubimport javax.swing.JFrame;
		
			JFrame myFrame = new JFrame();
			String myTitle = "Blank Frame";
			myFrame.setTitle(myTitle);
			myFrame.setSize(300, 200);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myFrame.setVisible(true);

	}

}
