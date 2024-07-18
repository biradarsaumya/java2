class Battery{

   String brandName;
   int id;
   String weight;
   
public boolean createBattery(String brandName,int id,String weight){
               
                boolean isBatteryCreated = false;
                if(brandName!=null && id > 0 && weight!=null){
                 this.brandName = brandName;
                 this.id   = id;
                 this.weight =weight;
                 
                 isBatteryCreated = true ; 
                }
                
                return isBatteryCreated ; 
      }
      
public void displayBatteryInfo(){
           System.out.println("The  brand name is"+this.brandName);
           System.out.println("The id is"+this.id);
           System.out.println("The weight is"+this.weight);
           
      }
	

}