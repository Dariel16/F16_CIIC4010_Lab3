import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Dariel");
		  MyPanelClass myPanel = new MyPanelClass();
          myFrame.getContentPane().add(myPanel);
          
	    myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		myFrame.setLocation(860, 440);
		myFrame.setSize(200,200);
		myFrame.setVisible(true);
	}
}
