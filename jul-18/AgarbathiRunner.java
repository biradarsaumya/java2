class AgarbathiRunner{

public static void main(String b[])
{	
	
	Agarbathi ref=new Agarbathi();
	boolean val =ref.createAgarbathi("Ullas",1,100,"Lavender",100.00);
	ref.displayAgarbathiInfo();
	
	Agarbathi ref1=new Agarbathi();
	boolean val =ref1.createAgarbathi("Rose",2,200,"Rose",200.00);
	ref.displayAgarbathiInfo();
	
	Agarbathi ref2=new Agarbathi();
	boolean val =ref2.createAgarbathi("Cycle",3,100,"Jasmine",150.00);
	ref.displayAgarbathiInfo();
	
	Agarbathi ref3=new Agarbathi();
	boolean val =ref3.createAgarbathi("Ambuja",4,50,"Hibiscus",50.00);
	ref.displayAgarbathiInfo();
	
	Agarbathi ref4=new Agarbathi();
	boolean val =ref4.createAgarbathi("Pooja",5,100,"Orchid",100.00);
	ref.displayAgarbathiInfo();
	
	Agarbathi ref5=new Agarbathi();
	boolean val =ref5.createAgarbathi("Poojam",9,300,"Lilly",300.00);
	ref.displayAgarbathiInfo();
	
}
}	
