class GardenRunner{

public static void main(String b[]){	
	
	Garden ref=new Garden();
	boolean val =ref.createGarden("Cubbon",1,"Bengaluru");
	ref.displayGardenInfo();
	
	Garden ref1=new Garden();
	boolean val =ref1.createGarden("Gadagi",2,"Bhalki");
	ref.displayGardenInfo();
	
	Garden ref2=new Garden();
	boolean val =ref2.createGarden("Barid Shahi",3,"Bidar");
	ref.displayGardenInfo();
	
	Garden ref3=new Garden();
	boolean val =ref3.createGarden("PaapNash",4,"Bidar");
	ref.displayGardenInfo();
	
	Garden ref4=new Garden();
	boolean val =ref4.createGarden("Hulkunti",5,"Bhalki");
	ref.displayGardenInfo();
	
	Garden ref5=new Garden();
	boolean val =ref5.createGarden("DevaDevVana",6,"Bidar");
	ref.displayGardenInfo();
	
	Garden ref6=new Garden();
	boolean val =ref6.createGarden("Lalbagh",7,"Bengaluru");
	ref.displayGardenInfo();
	
	Garden ref7=new Garden();
	boolean val =ref7.createGarden("Topairy",8,"Bengaluru");
	ref.displayGardenInfo();
}

}