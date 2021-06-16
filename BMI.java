import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BMI extends JFrame implements ActionListener {
	
	// GUI components
	JTextField jtfWeight;
	JTextField jtfHeight;
	JButton btnSubmit;
	JButton btnClear;
	JButton btnExit;
	
	// Create constructor
	public BMI() {
		
		// Create panel to hold two labels and text fields
		JPanel userEntry = new JPanel(new GridLayout(2, 2, 5, 5));
		
		jtfWeight = new JTextField();
		jtfHeight = new JTextField();
		
		// Create add labels and text fields to the userEntry
		userEntry.add(new JLabel("Enter weight in pounds: "));
		userEntry.add(jtfWeight);
		userEntry.add(new JLabel("Enter height in inches: "));
		userEntry.add(jtfHeight);
		
		// Create a second panel for the buttons
		JPanel panelButton = new JPanel();
		
		// Create and add three buttons to the panel
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(this);
		panelButton.add(btnSubmit);
		btnClear = new JButton("Clear");
		btnClear.addActionListener(this);
		panelButton.add(btnClear);
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		panelButton.add(btnExit);
		
		// Create third panel to hold two panels
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		JPanel parentPanel = new JPanel(layout);
		parentPanel.add(userEntry);
		parentPanel.add(panelButton);
		
		// Set the attributes to the frame
		this.setTitle("BMI Health Check");
		this.setSize(300, 130);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(parentPanel);
	} 
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
} // class








































































