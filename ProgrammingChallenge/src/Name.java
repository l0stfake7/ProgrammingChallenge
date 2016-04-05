
public class Name {
	
	private String name;
	
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
