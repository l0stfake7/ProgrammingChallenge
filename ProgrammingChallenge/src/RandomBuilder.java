
public class RandomBuilder {
	private int _rangeMin = 0;
	private int _rangeMax = 100;
	
	public RandomBuilder() {};
	
	public MyRandom buildRandom() {
		return new MyRandom(_rangeMin, _rangeMax);
	}
	
	public RandomBuilder rangeMin(int _rangeMin) {
		this._rangeMin = _rangeMin;
		return this;
	}
	
	public RandomBuilder rangeMax(int _rangeMax) {
		this._rangeMax = _rangeMax;
		return this;
	}
}
