package builder;

import tank.Tank;

public class TankBuilder implements IBuilder {
	private Tank tank;

	@Override
	public void reset() {
		tank = new Tank();
	}

	@Override
	public void setMainGan(String mainGan) {
		tank.setMainGan(mainGan);
	}

	@Override
	public void setAditionalGan(String aditionalGan) {
		tank.setAditionalGan(aditionalGan);
	}

	@Override
	public void setEngine(String engine) {
		tank.setEngine(engine);
	}

	@Override
	public void setGps(String gps) {
		tank.setGps(gps);
	}

	@Override
	public void setCaterpillars(String caterpillars) {
		tank.setCaterpillars(caterpillars);
	}

	public Tank getResult() {
		return tank;
	}
}
