package com.fitness;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
public static Main app;
private JRadioButton[] buttons =new JRadioButton[7]; //массив для кнопок параметров
private JFrame main_GUI=new JFrame();
private JPanel main_panel= new JPanel();
protected JComboBox menu1;
protected JComboBox menu2;
protected JComboBox menu3;
private JButton button_exit = new JButton("Выход");
private JButton button_calculate = new JButton("Рассчитать");
private JLabel info1 = new JLabel("Введите свой рост в см");
private JLabel info3 = new JLabel("Введите свою массу в кг");
private JLabel info4 = new JLabel("Введите свой пол");
private JLabel info5 = new JLabel("Введите свою категорию");
protected JTextField output= new JTextField("", 20);
protected JTextField input1 = new JTextField("", 20);
protected JTextField input2 = new JTextField("", 20);

public Main() {
output.setEditable(false);
main_GUI.setTitle ("Фитнес-алькулятор");
main_GUI.setBounds(0,0,600,800);
main_GUI.setResizable(false);

main_panel.setLayout(null);
main_GUI.add(main_panel); 

button_exit.setBounds(150,550,300,40);
main_panel.add(button_exit);

button_calculate.setBounds(150,270,300,50);
main_panel.add(button_calculate);

JLabel info2 = new JLabel("Выберите нужную операцию");
info2.setBounds(20,25,350,30);
main_panel.add(info2);
String[] s= {"Набор массы", "Сохранение массы", "Похудение"};
menu1=new JComboBox(s);

menu1.setBounds(240,30,200,25);
main_panel.add(menu1);

String[] s1= {"Мужской", "Женский"};
menu2=new JComboBox(s1);

menu2.setBounds(240,160,200,25);
main_panel.add(menu2);

String[] s2= {"1","2","3","4"};
menu3=new JComboBox(s2);

menu3.setBounds(240,200,200,25);
main_panel.add(menu3);


info1.setBounds(20,80,200,30);
main_panel.add(info1);

info3.setBounds(20,120,200,30);
main_panel.add(info3);

info4.setBounds(20,160,200,30);
main_panel.add(info4);

info5.setBounds(20,200,200,30);
main_panel.add(info5);


input1.setBounds(200,80,100,30);
main_panel.add(input1);

input2.setBounds(200,120,100,30);
main_panel.add(input2);

output.setBounds(150,330,300,200);
main_panel.add(output);

main_GUI.setVisible(true);
main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public static void main(String[] args) {
app=new Main();
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
}
}
	