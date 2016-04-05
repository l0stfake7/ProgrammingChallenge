import java.util.concurrent.ThreadLocalRandom;

public class MyRandom {
	
	private int _rangeMin;
	private int _rangeMax;
	
	public MyRandom(int rangeMin, int rangeMax) {
		this.setRangeMin(rangeMin);
		this.setRangeMax(rangeMax);
	}
	
	public int getInt() {
		return ThreadLocalRandom.current().nextInt(this._rangeMin, this._rangeMax + 1);
	}

	public int getRangeMax() {
		return _rangeMax;
	}

	public void setRangeMax(int _rangeMax) {
		this._rangeMax = _rangeMax;
	}

	public int getRangeMin() {
		return _rangeMin;
	}

	public void setRangeMin(int _rangeMin) {
		this._rangeMin = _rangeMin;
	}
}
