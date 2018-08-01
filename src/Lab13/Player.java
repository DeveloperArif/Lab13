package Lab13;

public abstract class Player {
	
	private String name;
	
	// constructor
	// has no return type
	// has the same name as the class
	public Player(String name) {
		this.name = name;
		
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	//return one of Rock, Paper, Scissors
	abstract public Roshambo generateRoshambo();
	
	public String toString() {
		return "Player " + name;
	}

}
