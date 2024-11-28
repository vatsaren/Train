package decorator;

public class Tank implements ITankDecorator {

	@Override
	public String startEngine() {
		return "пуск двигателя";
	}

	@Override
	public String move() {
		return "танк движется";
	}

	@Override
	public String fire() {
		return "выстрел";
	}
}
