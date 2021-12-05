package com.fitness;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import static com.fitness.Main.*;

public class LisstenersClass {
	Main w;
	LisstenersClass(Main w){
		this.w=w;
	}
	    public  ListenerCalculate listenerCalculate=new ListenerCalculate();
	    public class ListenerCalculate implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent event) {
	        	float rost = 0;
	        	w.output.setText("");
	        	boolean flag = true;
	        	try {
	                rost = Float.parseFloat(w.input1.getText());
	            } catch (NumberFormatException nfe) {
	            	flag = false;
	            	w.output.setText("Неверно задан рост");
	            }
	        	float massa = 0;
	        	try {
	                massa = Float.parseFloat(w.input2.getText());
	            } catch (NumberFormatException nfe) {
	            	flag = false;
	            	w.output.setText(w.output.getText()+"\n"+"Неверно задана масса");
	            }
	        	int vozrast = 0;
	        	try {
	                vozrast = Integer.parseInt(w.input3.getText());
	            } catch (NumberFormatException nfe) {
	            	flag = false;
	            	w.output.setText(w.output.getText()+"\n"+"Неверно задан возраст");
	            }
	        	
	        	if (flag) {
	        		System.out.println("888");
	        	Protein protein=new Protein();
	        	Fat fat=new Fat();
	        	Carb carb=new Carb();
	        	Calori calori=new Calori();
	        	IntegralDeathProb integraldeathprob =new IntegralDeathProb();
	        	
	        	Double protein_g = protein.Calculate(rost,massa,vozrast,"Male",2,"Набор массы");
	        	Double fat_g = fat.Calculate(rost,massa,vozrast,"Male",2,"Набор массы");
	        	Double carb_g = carb.Calculate(rost,massa,vozrast,"Male",2,"Набор массы");
	        	Double caloriNew = calori.Calculate(rost,massa,vozrast,"Male",2,"Набор массы");
	        	Double integraldeathprobNew = integraldeathprob.Calculate(vozrast);

	        	//Double String.format("%.0f%%",integraldeathprob.Calculate(30)*100);
	            //w.output.setText(Float.toString(c.Cal(w.set)));
	        	String template = "Белки: %f грамм\nЖиры: %f грамм\nУглеводы %f грамм\nКалории: %f ккал\nВероятность смерти: %.2f%%";
	        	w.output.setText(String.format(template, protein_g, fat_g, carb_g, caloriNew, integraldeathprobNew));
	        	}
	        	
	        }
	    }
}
