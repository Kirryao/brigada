package com.fitness;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
public static Main app;
private ListenersClass listenersClass=new ListenersClass(this);
private JFrame main_GUI=new JFrame();
private JPanel main_panel= new JPanel();
protected JComboBox menu1;
protected JComboBox menu2;
protected JComboBox menu3;
private JButton button_calculate = new JButton("Рассчитать");
private JLabel info1 = new JLabel("Введите свой рост в см");
private JLabel info3 = new JLabel("Введите свою массу в кг");
private JLabel info4 = new JLabel("Введите свой пол");
private JLabel info5 = new JLabel("Введите свою категорию");
private JLabel info6 = new JLabel("Введите cвой возраст");
private JLabel info7 = new JLabel("Выполнил:");
private JLabel info8 = new JLabel("ст. гр. ИВТ-323");
private JLabel info9 = new JLabel("Кислицын К.К.");
private JLabel info10 = new JLabel("Чепурин М.А.");
private JLabel info11 = new JLabel("Холодилина В.В.");
protected JTextArea output= new JTextArea();
protected JTextField input1 = new JTextField("", 20);
protected JTextField input2 = new JTextField("", 20);
protected JTextField input3 = new JTextField("", 20);


public Main() {
output.setEditable(false);
main_GUI.setTitle ("Фитнес-калькулятор");
main_GUI.setBounds(0,0,461,620);
main_GUI.setResizable(false);

main_panel.setLayout(null);
main_GUI.add(main_panel); 

button_calculate.setBounds(80,280,300,40);
button_calculate.addActionListener(listenersClass.listenerCalculate);
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

menu2.setBounds(240,200,200,25);
main_panel.add(menu2);

String[] s2= {"1","2","3","4"};
menu3=new JComboBox(s2);

menu3.setBounds(240,240,200,25);
main_panel.add(menu3);

info1.setBounds(20,80,200,30);
main_panel.add(info1);

info3.setBounds(20,120,200,30);
main_panel.add(info3);

info6.setBounds(20,160,200,30);
main_panel.add(info6);

info7.setBounds(350,450,200,20);
main_panel.add(info7);
info8.setBounds(320,470,200,20);
main_panel.add(info8);
info9.setBounds(323,490,200,20);
main_panel.add(info9);
info10.setBounds(332,510,200,20);
main_panel.add(info10);
info11.setBounds(307,530,200,20);
main_panel.add(info11);

info4.setBounds(20,200,200,30);
main_panel.add(info4);

info5.setBounds(20,240,200,30);
main_panel.add(info5);

input1.setBounds(200,80,241,30);
main_panel.add(input1);

input2.setBounds(200,120,241,30);
main_panel.add(input2);

input3.setBounds(200,160,241,30);
main_panel.add(input3);

output.setBounds(80,330,300,80);
main_panel.add(output);

main_GUI.setVisible(true);
main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public static void main(String[] args) {
app=new Main();
}
}
	