public class NameGenerator {
	
	private String generatedName = new String("");
	
	private final String namePrefix[] = {
		"ab", "be", "nar", "xan", "bell", "natr", "ev"
	};
			
	private final String nameStems[] =  {
		"adur", "aes", "anim", "apoll", "imac",
		"educ", "equis", "extr", "guius", "hann",
		"equi", "amora", "hum", "iace", "ille",
		"inept", "iuv", "obe", "ocul", "orbis"
	};
			
	private final String nameSuffix[] =  {
		"le", "us", "ix", "ox", "ith",
		"ath", "um", "ator", "or", "axia",
		"imus", "ais", "itur", "orex", "o",
		"y"
	};	
	
	NameGenerator(char A, char B) {
		
		MyRandom random = new RandomBuilder()
		.charBegin(A)
		.charEnd(B)
		.buildRandom();
		
		char randomizeChar;
		

		randomizeChar = random.getChar();

		for(int i = 0; i < this.namePrefix.length; i++) {
			if(randomizeChar == this.namePrefix[i].charAt(0)) {
				generatedName += this.namePrefix[i];
				break;
			}	
		}
		
		randomizeChar = random.getChar();
	
		for(int i = 0; i < this.nameStems.length; i++) {
			if(randomizeChar == this.nameStems[i].charAt(0)) {
				generatedName += this.nameStems[i];
				break;
			}	
		}
		
		randomizeChar = random.getChar();
		
		for(int i = 0; i < this.nameSuffix.length; i++) {
			if(randomizeChar == this.nameSuffix[i].charAt(0)) {
				generatedName += this.nameSuffix[i];
				break;
			}	
		}
	}

	public String getName() {
		return generatedName;
	}
}
