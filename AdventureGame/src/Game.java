import java.util.Scanner;

public class Game {
Player player;
Location location;
Scanner scan =new Scanner(System.in);
public void login() {
	
	System.out.println("Welcome to the mysterious island!!");
	System.out.println("Before to get started, let me know your name: ");
	String playerName=scan.nextLine();
	player = new Player(playerName);
	player.selectChar();
	start();
}
public void start() {
	while(true) {
	System.out.println();
	System.out.println("******************");
	System.out.println();
	System.out.println("Lütfen eylem gerçekleþtirmek için bir MEKAN seçin");
	System.out.println("1. Aðaç Ev -->size ait güvenli bir mekan, düþman yokk!");
	System.out.println("2. Maðara --> Dikkat, ZOMBÝ çýkabilir!!");
	System.out.println("3. Orman -->Dikkat, VAMPÝR çýkabilir!!");
	System.out.println("4. Nehir --> Dikkat, AYI çýkabilir!!");
	System.out.println("5. Maðaza --> Silah veya Zýrh alabilirsin ");
	int selLoc = scan.nextInt();
	while(selLoc<0|| selLoc >5) {
		System.out.println("Lütfen geçerli bir mekan seçinizz: ");
		selLoc = scan.nextInt();
	}
	
	switch(selLoc) {
	case 1:
		location=new treeHouse(player);
		break;
	case 2:
		location= new Cave(player);
		break;
	case 3:
		location = new Forest(player);
		break;
		
	case 4:
		location = new River(player);
		break;
	case 5:
		location = new toolStore(player);
		break;
		default:
			location=new treeHouse(player);
			break;
	}
	if(location.getClass().getName().equals("treeHouse")) {
		if(player.getInv().isFirewood() && player.getInv().isFood()&& player.getInv().isWater()) {
			System.out.println(" Tebriklerr ! Oyunu Kazandýn :D");
			break;
		}
	}
	if(!location.getLocation()) {
		System.out.println("OYUN BÝTTÝ!");
		break;
	}
	}
}
}
