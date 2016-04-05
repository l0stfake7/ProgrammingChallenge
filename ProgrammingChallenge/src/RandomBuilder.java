
public class RandomBuilder {
	private int _rangeMin = 0;
	private int _rangeMax = 100;
	
	private char _charBegin = 'a';
	private char _charEnd = 'ż';
	
	public RandomBuilder() {};
	
	public MyRandom buildRandom() {
		return new MyRandom(_rangeMin, _rangeMax, _charBegin, _charEnd);
	}
	
	public RandomBuilder rangeMin(int _rangeMin) {
		this._rangeMin = _rangeMin;
		return this;
	}
	
	public RandomBuilder rangeMax(int _rangeMax) {
		this._rangeMax = _rangeMax;
		return this;
	}
	
	public RandomBuilder charBegin(char _charBegin) {
		this._charBegin = _charBegin;
		return this;
	}
	
	public RandomBuilder charEnd(char _charEnd) {
		this._charEnd = _charEnd;
		return this;
	}	
	
}
