import java.util.Scanner;

public class Player {
	Scanner scan = new Scanner(System.in);
private int damage, healthy , money, rHealth;
public int getrHealth() {
	return rHealth;
}
public void setrHealth(int rHealth) {
	this.rHealth = rHealth;
}
private String name, cName;
private Inventory inv;
public int getDamage() {
	return damage;
}
public void selectChar() {
	switch(charMenu()) {
	case 1:
		init("Samuray",5,21,15);
		break;
	case 2:
		init("Okçu",7,18,20);
		
		break;
	case 3:
		init("Þovalye",8,24,5);
		
		break;
		default:
			init("Samuray",5,21,15);
			break;
	}
	System.out.println("Karakteriniz oluþtu ");
	System.out.println("Tür: "+ getcName()+ "\t Hasar: "+ getDamage()+ " \t Saðlýk: "+ getHealthy()+ "\t Para: "+getMoney());
	
	
}
public void init(String cname,int dmg, int health, int money) {
	setcName(cname);
	setDamage(dmg);
	setHealthy(health);
	setMoney(money);
	setrHealth(health);
}
public int charMenu() {
	System.out.println("Lütfen bir karakter seçiniz-->");
	System.out.println("1. Türü: Samuray \t Hasar: 5 \t Saðlýk: 21 \t Para: 15");
	System.out.println("2. Türü: Okçu    \t Hasar: 7 \t Saðlýk: 18 \t Para: 20");
	System.out.println("3. Türü: Þovalye \t Hasar: 8 \t Saðlýk: 24 \t Para: 5");
	System.out.println("Karakter Seçiminiz");

	int charID = scan.nextInt();
	while(charID<1 || charID>3) {
		System.out.println("geçersiz karakter, lütfen yeniden karakter seçiniz");
		charID = scan.nextInt();
	}
	return charID;
}
public int  totalDamage() {
	return this.getDamage()+this.getInv().getDamage();
}
public void setDamage(int damage) {
	this.damage = damage;
}
public int getHealthy() {
	return healthy;
}
public void setHealthy(int healthy) {
	this.healthy = healthy;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public Inventory getInv() {
	return inv;
}
public void setInv(Inventory inv) {
	this.inv = inv;
}
public Player(String name) {
	super();
	this.name = name;
	this.inv=new Inventory();
}

}
