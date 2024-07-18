class NewsPaperRunner{

public static void main(String b[])
{	
	
	NewsPaper ref=new NewsPaper();
	boolean val =ref.createNewsPaper("Vijayvani",1,5,"Kannada");
	ref.displayNewsPaperInfo();
	
	NewsPaper ref1=new NewsPaper();
	boolean val =ref1.createNewsPaper("VijayKarnataka",2,5,"Kannada");
	ref.displayNewsPaperInfo();
	
	NewsPaper ref2=new NewsPaper();
	boolean val =ref2.createNewsPaper("Prajavani",3,5,"Kannada");
	ref.displayNewsPaperInfo();
	
	NewsPaper ref3=new NewsPaper();
	boolean val =ref3.createNewsPaper("Samyukata",4,5,"Kannada");
	ref.displayNewsPaperInfo();
	
	NewsPaper ref4=new NewsPaper();
	boolean val =ref4.createNewsPaper("Udayvani",6,5,"Kannada");
	ref.displayNewsPaperInfo();
	
	NewsPaper ref5=new NewsPaper();
	boolean val =ref5.createNewsPaper("Times of India",8,6,"English");
	ref.displayNewsPaperInfo();
	
	NewsPaper ref6=new NewsPaper();
	boolean val =ref6.createNewsPaper("Kannada Prabha",2,5,"Kannada");
	ref.displayNewsPaperInfo();

	
	
}

}