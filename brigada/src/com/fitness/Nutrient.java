package com.fitness;
//для расчёта общей калорийности и конкретных нутриентов
public abstract class Nutrient{
	private double multiplier;
	private double dividend;
	//Цель:Похудение,сохранение и набор массы
	//Высота в сантиметрах
	//Вес в килограммах
	//Возраст в годах
	//Пол(Male,Female)
	//Активность по МР 2.3.1-0253/21
	//Множитель конкретного нутриента по МР 2.3.1-0253/21
	Nutrient(double multiplier, double dividend){
	this.multiplier=multiplier;
	this.dividend=dividend;
	}
	//Формула подсчета Миффлин-Сан Жеора
	public double Calculate(double h,double m,int age,String sex,int activity,String goal) {
		double f=9.99*m + 6.25*h- 4.92*age;
		if(sex=="Мужской") {
			f+=5;
		}
		else {
			f-=161;
		}
		if(goal=="Набор массы") {
			f*=1.2;
		}
		if(goal=="Похудение") {
			f*=0.8;
		}
		switch(activity) {
		case 1:
			f*=1.4;
			break;
		case 2:
			f*=1.6;
			break;
		case 3:
			f*=1.9;
			break;
		case 4:
			f*=2.2;
			break;
		}
		return f*multiplier;
	}

}
