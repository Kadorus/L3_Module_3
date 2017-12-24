package abstract_classes.cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		return population * growthRate + 1000000;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public double getGrowthRate() {
		return growthRate;
	}
}
