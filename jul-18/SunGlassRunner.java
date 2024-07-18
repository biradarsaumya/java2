class SunGlassRunner{

public static void main(String b[])
{	
	
	SunGlass ref=new SunGlass();
	boolean val =ref.createSunGlass("LensCart",1,"Oval",1000.00);
	ref.displaySunGlassInfo();
	
	SunGlass ref1=new SunGlass();
	boolean val =ref1.createSunGlass("Ray Ban",2,"Square",2000.00);
	ref.displaySunGlassInfo();
	
	SunGlass ref2=new SunGlass();
	boolean val =ref2.createSunGlass("Mauli Jim",3,"Round",3000.00);
	ref.displaySunGlassInfo();
	
	SunGlass ref3=new SunGlass();
	boolean val =ref3.createSunGlass("Tom Ford",4,"Rectangular",1000.00);
	ref.displaySunGlassInfo();
	
	SunGlass ref4=new SunGlass();
	boolean val =ref4.createSunGlass("Persol",5,"Oval",500.00);
	ref.displaySunGlassInfo();
	
	SunGlass ref5=new SunGlass();
	boolean val =ref5.createSunGlass("Prada",6,"Oval",800.00);
	ref.displaySunGlassInfo();
	
	
}

}