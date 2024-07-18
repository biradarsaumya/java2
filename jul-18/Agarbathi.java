class Agarbathi{

   String brandName;
   int id;
   int noOfSticks;
   String fragrance;
   double price;


public boolean createAgarbathi(String brandName ,int id,int noOfSticks,String fragrance,double price){
               
                boolean isAgarbathiCreated = false;
                if(brandName!=null && id > 0 && noOfSticks>0 && fragrance!=null && price>0.0){
                 this.brandName = brandName;
                 this.id   = id;
                 this.noOfSticks =noOfSticks;
                 this.fragrance=fragrance;
				 this.price=price;
				 
                 isAgarbathiCreated = true ; 
                }
                
                return isAgarbathiCreated ; 
      }
      
public void displayAgarbathiInfo(){
           System.out.println("The brand Name is"+this.brandName);
           System.out.println("The id is"+this.id);
           System.out.println("The no Of Sticks"+this.noOfSticks);
           System.out.println("The fragrance is"+this.fragrance);
		   System.out.println("The price is"+this.price);
      }
	

}