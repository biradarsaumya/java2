class AtmMachineRunner{

public static void main(String b[])
{	
	
	AtmMachine ref=new AtmMachine();
	boolean val =ref.createAtmMachine("State Bank og India",1,"Debit");
	ref.displayAtmMachineInfo();
	
	AtmMachine ref1=new AtmMachine();
	boolean val =ref1.createAtmMachine("Axis",2,"Credit");
	ref.displayAtmMachineInfo();
	
	AtmMachine ref2=new AtmMachine();
	boolean val =ref2.createAtmMachine("Bank of Baroda",3,"Debit");
	ref.displayAtmMachineInfo();
	
	AtmMachine ref3=new AtmMachine();
	boolean val =ref3.createAtmMachine("ICCI",4,"Credit");
	ref.displayAtmMachineInfo();
	
	AtmMachine ref4=new AtmMachine();
	boolean val =ref4.createAtmMachine("Krishna Yojana",5,"Debit");
	ref.displayAtmMachineInfo();
	
	AtmMachine ref5=new AtmMachine();
	boolean val =ref5.createAtmMachine("DCC",6,"Credit");
	ref.displayAtmMachineInfo();
	
	
}

}