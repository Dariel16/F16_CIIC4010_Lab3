import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Dariel");
		  MyPanelClass myPanel = new MyPanelClass();
          myFrame.getContentPane().add(myPanel);
          
	    myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		myFrame.setLocation(800, 350);
		myFrame.setSize(400,400);
		myFrame.setVisible(true);
	}
}
