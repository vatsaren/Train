package decorator;


public interface ITankDecorator {
	//Не обязательно что бы методы совпадали с классом, который оборачиваем
	String startEngine();
	String move();
	String fire();
}
