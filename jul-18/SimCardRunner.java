class SimCardRunner{

public static void main(String b[])
{	
	
	SimCard ref=new SimCard();
	boolean val =ref.createSimCard("Airtel",1,"28 days");
	ref.displaySimCardInfo();
	
	SimCard ref1=new SimCard();
	boolean val =ref1.createSimCard("Idea",2,"30 days");
	ref.displaySimCardInfo();
	
	SimCard ref2=new SimCard();
	boolean val =ref2.createSimCard("Vodaphone",3,"15 days");
	ref.displaySimCardInfo();
	
	SimCard ref3=new SimCard();
	boolean val =ref3.createSimCard("BSNL",4,"48 days");
	ref.displaySimCardInfo();
	
	SimCard ref4=new SimCard();
	boolean val =ref4.createSimCard("Docomo",6,"56 days");
	ref.displaySimCardInfo();
	
	SimCard ref5=new SimCard();
	boolean val =ref5.createSimCard("Giganet",7,"68 days");
	ref.displaySimCardInfo();
	
	
	
	
}

}