
public class treeHouse extends normalLoc {

	treeHouse(Player player) {
		super(player, "Aðaç Ev");
		// TODO Auto-generated constructor stub
	}
public boolean getLocation() {
	player.setHealthy(player.getrHealth());
	System.out.println("Ýyileþtin, canýn artýk FULL ");
	System.out.println("Þuan aðaç evdesin!");
	return true;
}

}
