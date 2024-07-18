class SunGlass{

   String brandName;
   int id;
   String type;
   double price;
   
public boolean createSunGlass(String brandName,int id,String type,double price){
               
                boolean isSunGlassCreated = false;
                if(brandName!=null && id > 0 && type!=null && price>0.0){
                 this.brandName = brandName;
                 this.id   = id;
                 this.type = type;
				 this,price=price;
                 
                 isSunGlassCreated = true ; 
                }
                
                return isSunGlassCreated ; 
      }
      
public void displaySunGlassInfo(){
           System.out.println("The brand name is"+this.brandName);
           System.out.println("The id is"+this.id);
           System.out.println("The type is"+this.type);
		   System.out.println("The price is"+this.price);
           
      }
	

}