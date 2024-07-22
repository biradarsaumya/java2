class SunGlass{

   String brandName;
   int id;
   String type;
   double price;
   
public SunGlass(String brandName,int id,String type,double price){
               
                System.out.println("SunGlass started");
                 this.brandName = brandName;
                 this.id   = id;
                 this.type = type;
				 this,price=price;
                System.out.println("SunGlass ended"); 
                
                
                
      }
      
public void displaySunGlassInfo(){
           System.out.println("The brand name is"+this.brandName);
           System.out.println("The id is"+this.id);
           System.out.println("The type is"+this.type);
		   System.out.println("The price is"+this.price);
           
      }
	

}