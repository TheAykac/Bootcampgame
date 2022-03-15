package entities;

public class Game {
	private int id;
	private String name;
	private String unitPrice;
	
	public Game() {
		
	}

	public Game(int id, String name, String unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	

}
