
public class Name {
	
	private String name;
	
	private String namePrefix[] = {
		"", //who said we need to add a prefix?
		"bel", //lets say that means "the good"
		"nar", //"The not so good as Bel"
		"xan", //"The evil"
		"bell", //"the good"
		"natr", //"the neutral/natral"
		"ev" //Man am I original	
	};
	
	private String nameStems[] = {
		"adur", "aes", "anim", "apoll", "imac",
		"educ", "equis", "extr", "guius", "hann",
		"equi", "amora", "hum", "iace", "ille",
		"inept", "iuv", "obe", "ocul", "orbis"
	};
	
	private String nameSuffix[] = {
		"", "us", "ix", "ox", "ith",
		"ath", "um", "ator", "or", "axia",
		"imus", "ais", "itur", "orex", "o",
		"y"
	};	
	
	Name(String name) {
		this.name = name;
		System.out.print("Name create:");
		System.out.print(name);
		System.out.println("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
