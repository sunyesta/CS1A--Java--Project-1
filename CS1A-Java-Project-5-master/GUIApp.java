/**
 * One object of this class instantiates a JFrame, and a place for the user to
 * type her name, and a button. If the user types her name and clicks the "Hi"
 * button, a personalized greeting will appear on the JFrame.
 * Also, if they click the "Bye" button, then another personalized greeting will appear on the JFrame.
 */
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class GUIApp implements ActionListener {
	private JFrame myWindow;
	private JTextField userInput;
	private JButton hiButton;
	private JButton byeButton;
	private JLabel output;
	
	/**
	 *  constructor sets up the JFrame and put all the components on it.
	 */
	public GUIApp() {
		setUpWindow();
		setUpEntry();
		setUpHelloButton();
		setUpByeButton();
		setUpOutput();
		myWindow.validate();
	}
	
	/**
	 *  Instantiates the new JFrame and sets it up empty
	 */
	public void setUpWindow() {
		myWindow = new JFrame();
		//myWindow.setLayout(new FlowLayout());
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(500, 200);
		myWindow.setVisible(true);
	}
	
	/**
	 *  Instantiates a text entry box for user input and adds it to the JFrame.
	 */
	public void setUpEntry() {
		userInput = new JTextField();
		userInput.setBounds(200,5, 150, 30); //sets the location and size
		myWindow.add(userInput);
	}
	
	/**
	 *  Instantiates the hiButton button, adds it to the JFrame, 
	 *  and makes this class listen and react to a user event on that button.
	 */
	public void setUpHelloButton() {
		hiButton = new JButton("Hi");
		hiButton.setBounds(100,5, 80, 30); //sets the location and size
		myWindow.add(hiButton);
		hiButton.addActionListener(this);
	}
	
	/**
	 *  Instantiates the bye button, adds it to the JFrame, 
	 *  and makes this class listen and react to a user event on that button.
	 */
	public void setUpByeButton() {
		byeButton = new JButton("Bye");
		byeButton.setBounds(5,5, 80, 30); //sets the location and size
		myWindow.add(byeButton);
		byeButton.addActionListener(this);
	}
	
	/**
	 *  Instantiates a JLabel for displaying the output, adds it to the JFrame,
	 *  but leaves the JLabel empty for now.
	 */
	public void setUpOutput() {
		output = new JLabel("                               ");
		output.setFont (output.getFont ().deriveFont (30f));

		myWindow.add(output);
	}
	
	/**
	 *  Java calls this method when the user clicks a button that has this class
	 *  as its ActionListener. This method then puts a string message onto the
 	 *  JLabel output.
	 */
	public void actionPerformed(ActionEvent event) {
		String usersName = userInput.getText();
		if(usersName.equals("")){
			output.setText("You need to enter in a name!");
		}else{
			if (event.getActionCommand() == "Hi") {
				
			
				output.setText("Well hello there " + usersName + "!");
			}else if (event.getActionCommand() == "Bye"){
				output.setText("Goodbye " + usersName + "!");
			}
		}	
	}
	
}
