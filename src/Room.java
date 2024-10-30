

public class Room {

	// Object variables - usually private
	private String description; // Room description displayed to player
	
	// Object references to other Room objects - null by default
	private Room east; // Reference to room to the east of this room
	private Room west; // Reference to room to the west of this room
	private Room north;
	private Room south;
	private Room up;
	private Room down;
	
	//
	public Item getItem() {
		return P;
		}
	public void setItem(Item p) {
		P = p;
	}

	// Constructor method - initializes object variables
	// Does not initialize Room variables because they default to null
	// which is what we want.
	public Room(String desc) {
		description = desc;
	}
	
	// Object methods
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item i) {
		item = i;
	}
	
	public void removeItem() {
		item = null
	}
	// Formats object data into a string.
	// Returns that string.
	public String toString() {
		return description;
	}
	
	// Updates one of the Room variables.
	// The character dir identifies which variable to update.
	// Update the variable to refer to the room r.
	public void addExit(char dir, Room r) {
		if (dir == 'e')
			east = r;
		else if (dir == 'w')
			west = r;
		// etc.
	}
	
	public Room getExit(char dir) {
		if (dir == 'e')
			return east;
		else if (dir == 'w')
			return west;
		// etc.
		else
			return null;
	}
	
}















