
public class treeHouse extends normalLoc {

	treeHouse(Player player) {
		super(player, "A�a� Ev");
		// TODO Auto-generated constructor stub
	}
public boolean getLocation() {
	player.setHealthy(player.getrHealth());
	System.out.println("�yile�tin, can�n art�k FULL ");
	System.out.println("�uan a�a� evdesin!");
	return true;
}

}
