package tank;

public class Tank {

	String mainGan;
	String aditionalGan;
	String engine;
	String gps;
	String caterpillars;

	public void setMainGan(String mainGan) {
		this.mainGan = mainGan;
	}

	public void setAditionalGan(String aditionalGan) {
		this.aditionalGan = aditionalGan;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public void setCaterpillars(String caterpillars) {
		this.caterpillars = caterpillars;
	}

	@Override
	public String toString() {
		String outString = "";
		outString += "Это танк с " + mainGan + "\n";
		outString += "Также он имеет дополнительное оружие в виде " + aditionalGan + "\n";
		outString += "Двигатель мощностью " + engine + " лошадей" + "\n";
		if (gps != null && !gps.isEmpty()) {
			outString += "Имеется " + gps + "\n";
		}
		outString += "Передвигается с помощью" + "\n";
		return outString;
	}
}
