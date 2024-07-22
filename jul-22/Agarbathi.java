class Agarbathi{

   String brandName;
   int id;
   int noOfSticks;
   String fragrance;
   double price;


public Agarbathi(String brandName ,int id,int noOfSticks,String fragrance,double price){
               
                System.out.println("Agarbathi started");
                 this.brandName = brandName;
                 this.id   = id;
                 this.noOfSticks =noOfSticks;
                 this.fragrance=fragrance;
				 this.price=price;
				System.out.println("Agarbathi ended");
}
                
                
public void displayAgarbathiInfo(){
           System.out.println("The brand Name is"+this.brandName);
           System.out.println("The id is"+this.id);
           System.out.println("The no Of Sticks"+this.noOfSticks);
           System.out.println("The fragrance is"+this.fragrance);
		   System.out.println("The price is"+this.price);
      }
	

}