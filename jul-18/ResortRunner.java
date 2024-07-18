class ResortRunner{

public static void main(String b[])
{	
	
	Resort ref=new Resort();
	boolean val =ref.createResort("Royal Orchids",1,"Sam",50,"Bengaluru");
	ref.displayResortInfo();
	
	Resort ref1=new Resort();
	boolean val =ref1.createResort("The Signature",2,"Sam",50,"Bengaluru");
	ref.displayResortInfo();
	
	Resort ref2=new Resort();
	boolean val =ref2.createResort("Heaven",3,"Sam",40,"Bengaluru");
	ref.displayResortInfo();
	
	Resort ref3=new Resort();
	boolean val =ref3.createResort("Sky",4,"Sam",30,"Bengaluru");
	ref.displayResortInfo();
	
	Resort ref4=new Resort();
	boolean val =ref4.createResort("Royal Orchids",5,"Sam",40,"Bengaluru");
	ref.displayResortInfo();
	
	Resort ref5=new Resort();
	boolean val =ref5.createResort("GoldenMetrol",6,"Sam",30,"Bengaluru");
	ref.displayResortInfo();
	
	Resort ref6=new Resort();
	boolean val =ref6.createResort("Pavitra",7,"Sam",100,"Bengaluru");
	ref.displayResortInfo();
	
	Resort ref7=new Resort();
	boolean val =ref7.createResort("Ankit Vista",8,"Sam",20,"Bengaluru");
	ref.displayResortInfo();
	
	
}

}