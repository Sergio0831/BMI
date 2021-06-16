import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI extends JFrame implements ActionListener {
	
	// GUI components
	private JTextField jtfWeight;
	private JTextField jtfHeight;
	private JButton btnSubmit;
	private JButton btnClear;
	private JButton btnExit;
	
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
		
		if (e.getSource() == btnSubmit) {
			try {
				// Get weight and height and convert to kg and meters
			double weight = Double.parseDouble(jtfWeight.getText()) *  0.45359237;
			double height = Double.parseDouble(jtfHeight.getText()) * 0.0254;
			
			// Calculate result BMI result
			double result = weight / Math.pow(height, 2);
			
			String text = "";
			
			if (result <= 16) {
				text = "seriously underweight";
			} else if (result <= 18) {
				text = "underweight";
			} else if (result <= 24) {
				text = "normal weight";
			} else if (result <= 29) {
				text = "overweight";
			} else if (result <= 35) {
				text = "seriosly overweight";
			} else {
				text = "gravely overweight";
			}
			
			JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + Math.round(result) + " This is considered " + text + ".");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Enter a number.");
			}
		}
		else if (e.getSource() == btnClear) {
			jtfWeight.setText("");
			jtfHeight.setText("");
		}
		else if (e.getSource() == btnExit) {
			System.exit(0);
		}
	}
	
} // class








































































