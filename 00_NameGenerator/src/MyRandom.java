import java.util.concurrent.ThreadLocalRandom;

public class MyRandom {
	
	private int _rangeMin;
	private int _rangeMax;
	
	private char _charBegin;
	private char _charEnd;
	
	private String _alphabet = new String("aąbcćdeęfghijklłmnńoóprsśtuvwyxzźż");
	
	private char[] _alphabetChar = {
			'a', 'ą', 'b', 'c', 'ć', 'd', 'e', 'ę', 'f', 'g',
			'i', 'j', 'k', 'l', 'ł', 'm', 'n', 'ń', 'o', 'p',
			'r', 's', 'ś', 't', 'u', 'v', 'w', 'y', 'x', 'z', 
			'ź', 'ż'
	};
	
	public MyRandom(int rangeMin, int rangeMax, char charBegin, char charEnd) {
		this.setRangeMin(rangeMin);
		this.setRangeMax(rangeMax);
		this.setCharBegin(charBegin);
		this.setCharEnd(charEnd);
		
	}
	
	public int getInt() {
		return ThreadLocalRandom.current().nextInt(this._rangeMin, this._rangeMax + 1);
	}

	public char getChar() {
		int temp1 = 0,
			temp2 = 0;
		
		for(int i = 0; i < _alphabetChar.length; i ++) {
			if(_alphabetChar[i] == this._charBegin) {
				temp1 = i;
				break;
			}
		}
		
		for(int i = 0; i < _alphabetChar.length; i ++) {
			if(_alphabetChar[i] == this._charEnd) {
				temp2 = i;
				break;
			}
		}
		
		return this._alphabet.charAt(ThreadLocalRandom.current().nextInt(temp1, temp2 + 1));
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

	public char getCharBegin() {
		return _charBegin;
	}

	public void setCharBegin(char _charBegin) {
		this._charBegin = _charBegin;
	}

	public char getCharEnd() {
		return _charEnd;
	}

	public void setCharEnd(char _charEnd) {
		this._charEnd = _charEnd;
	}
}
