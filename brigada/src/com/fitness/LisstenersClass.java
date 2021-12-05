package com.fitness;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	            
	        	Fat fat=new Fat();
	        	System.out.println(fat.Calculate(180,60,30,"Male",2,"Набор массы"));
	        	Carb carb=new Carb();
	        	System.out.println(carb.Calculate(180,60,30,"Male",2,"Набор массы"));
	        	Protein protein=new Protein();
	        	System.out.println(protein.Calculate(180,60,30,"Male",2,"Набор массы"));
	        	Calori calori=new Calori();
	        	System.out.println(calori.Calculate(180,60,30,"Male",2,"Набор массы"));
	        	IntegralDeathProb integraldeathprob =new IntegralDeathProb();
	        	System.out.println(String.format("%.0f%%",integraldeathprob.Calculate(30)*100));
	            //w.output.setText(Float.toString(c.Cal(w.set)));
	        }
	    }
}
