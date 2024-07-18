class BatteryRunner{

public static void main(String b[])
{	
	
	Battery ref=new Battery();
	boolean val =ref.createBattery("Duracel",1,"20kgs");
	ref.displayBatteryInfo();
	
	Battery ref1=new Battery();
	boolean val =ref1.createBattery("Evertday",2,"10kgs");
	ref.displayBatteryInfo();
	
	Battery ref2=new Battery();
	boolean val =ref2.createBattery("Exide",3,"30kgs");
	ref.displayBatteryInfo();
	
	Battery ref3=new Battery();
	boolean val =ref3.createBattery("LiPo",4,"40kgs");
	ref.displayBatteryInfo();
	
	Battery ref4=new Battery();
	boolean val =ref4.createBattery("Mercury",5,"30kgs");
	ref.displayBatteryInfo();
	
	Battery ref5=new Battery();
	boolean val =ref5.createBattery("Energizer",6,"30kgs");
	ref.displayBatteryInfo();
	
	
	
	
}

}