import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.Container;

public class BMIClass extends JFrame {
	//variables
	double height;
	double weight;
	double BMI;
	String BMIValues;
	private final JButton calculateJButton;
	private final JTextField heightinput;
	private final JTextField weightinput;
	private final JLabel bmioutput;
	private final Container bmicontainer;
	private final GridLayout bmilayout;
	private final JLabel heightlabel;
	private final JLabel weightlabel;
	
	
	//constructor
	public BMIClass() {
		super("BMI Calculator");
		//setLayout(new FlowLayout());

		bmicontainer = new Container();
		
		bmilayout = new GridLayout(3,2,20,50);
		setLayout(bmilayout);
		
		heightlabel = new JLabel("Please enter height in inches.");
		add(heightlabel);
		heightinput = new JTextField(6);
		add(heightinput);
		
		weightlabel = new JLabel("Please enter weight in pounds.");
		add(weightlabel);
		weightinput = new JTextField(6);
		add(weightinput);
		
		calculateJButton = new JButton("Please click here for your BMI");
		add(calculateJButton);
		
		bmioutput = new JLabel();
		add(bmioutput);
		
		calculateJButton.addActionListener(new AListener());
		}
		
	public double getheight() {
		this.height = Double.parseDouble(heightinput.getText());
		return this.height;
	}
	public double getweight() {
		this.weight = Double.parseDouble(weightinput.getText());
		return this.weight;
	}
	
	
		public double calculateBMI(double height, double weight) {
			this.height = height;
			this.weight = weight;
			this.BMI = (weight*703) / (height*height);
			return this.BMI;
		}
		
		public String printBMI() {
			
			 double h = getheight();
			 double w = getweight();
			 this.BMI = Math.round(calculateBMI(h,w)*100)/100.0d;
			 String bmi = String.valueOf(this.BMI);
			 String value = "";
			 if(this.BMI < 18.5) {
				 value="Underweight";
			 }
			 else if(this.BMI>=18.5 && this.BMI<=24.9 ) {
				 value="Normal!";
			 }
			 else if(this.BMI>=25 && this.BMI<=29.9) {
				 value="Overweight";
			 }
			 else if (this.BMI>=30) {
				 value="Obese not good";
			 }
			String bmitext = "Your BMI is " + bmi + ". You are " + value;
			return bmitext;
			
		}
	
	 class AListener implements ActionListener{
		 public void actionPerformed(ActionEvent e)
		 {
			 
			 
			 String bmitext = printBMI();
			 
			bmioutput.setText(bmitext);
		 }
	 }











}
