package director;

import builder.*;

public class Director {

	public void constructBigTank(IBuilder builder) {
		builder.reset();
		builder.setMainGan("большая пушка");
		builder.setAditionalGan("большой пулемёт");
		builder.setEngine("1000");
		builder.setGps("спутниковый gps");
		builder.setCaterpillars("мощных ракетных двигателей(парит над землёй)");
	}

	public void constructSmallTank(IBuilder builder) {
		builder.reset();
		builder.setMainGan("небольшая пушка");
		builder.setAditionalGan("небольшой пулемёт");
		builder.setEngine("500");
		builder.setCaterpillars("гусеницы");
	}

	public void constructBtr(IBuilder builder) {
		builder.reset();
		builder.setAditionalGan("небольшой пулемёт");
		builder.setEngine("350");
		builder.setCaterpillars("колёса");
	}
}
