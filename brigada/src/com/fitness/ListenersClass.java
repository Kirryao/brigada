package com.fitness;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import static com.fitness.Main.*;

public class ListenersClass {
	Main w;
	ListenersClass(Main w){
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
	        	Protein protein=new Protein();
	        	Fat fat=new Fat();
	        	Carb carb=new Carb();
	        	Calori calori=new Calori();
	        	IntegralDeathProb integraldeathprob =new IntegralDeathProb();
	        	String sex = w.menu2.getSelectedItem().toString();
	        	Integer type = Integer.parseInt(w.menu3.getSelectedItem().toString());
	        	String goal = w.menu1.getSelectedItem().toString();


	        	
	        	Double protein_g = protein.Calculate(rost,massa,vozrast,sex,type,goal);
	        	Double fat_g= fat.Calculate(rost,massa,vozrast,sex,type,goal);
	        	Double carb_g = carb.Calculate(rost,massa,vozrast,sex,type,goal);
	        	Double caloriNew = calori.Calculate(rost,massa,vozrast,sex,type,goal);
	        	Double integraldeathprobNew = integraldeathprob.Calculate(vozrast);

	        	String template = "Белки: %.0f грамм\nЖиры: %.0f грамм\nУглеводы %.0f грамм\nКалории: %.0f ккал\nВероятность смерти: %.0f%%";
	        	w.output.setText(String.format(template,  protein_g, fat_g, carb_g, caloriNew, integraldeathprobNew*100));
	        	}
	        }
	    }
}
