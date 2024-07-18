class ShampooRunner{

public static void main(String b[]){	
	
	Shampoo ref=new Shampoo();
	boolean val =ref.createShampoo("Dove",1,1,"Normal",200.00,"18/07/24","18/07/26");
	ref.displayShampooInfo();
	
	Shampoo ref1=new Shampoo();
	boolean val =ref1.createShampoo("SunSilk",2,1,"AntiDandruff",100.00,"11/07/24","11/07/26");
	ref.displayShampooInfo();
	
	Shampoo ref2=new Shampoo();
	boolean val =ref2.createShampoo("Chick",3,1,"Oilly",50.00,"15/07/24","15/07/26");
	ref.displayShampooInfo();
	
	Shampoo ref3=new Shampoo();
	boolean val =ref3.createShampoo("Vatika",4,1,"Long Hair",100.00,"18/07/24","18/07/26");
	ref.displayShampooInfo();
	
	Shampoo ref4=new Shampoo();
	boolean val =ref4.createShampoo("Karthika",5,1,"Dry",100.00,"19/07/24","19/07/26");
	ref.displayShampooInfo();
	
	Shampoo ref5=new Shampoo();
	boolean val =ref5.createShampoo("Clinic Plus",6,1,"Strong",500.00,"14/07/24","14/07/26");
	ref.displayShampooInfo();
	
	Shampoo ref6=new Shampoo();
	boolean val =ref6.createShampoo("Loreal",1,1,"Shiny",1000.00,"11/07/24","11/07/26");
	ref.displayShampooInfo();
	
	}
}
	