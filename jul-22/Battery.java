class Battery{

   String brandName;
   int id;
   String weight;
   
public Battery(String brandName,int id,String weight){
               
                System.out.prinltn("Battery started");
                 this.brandName = brandName;
                 this.id   = id;
                 this.weight =weight;
                System.out.prinltn("Battery ended"); 
                  
                 
      }
      
public void displayBatteryInfo(){
           System.out.println("The  brand name is"+this.brandName);
           System.out.println("The id is"+this.id);
           System.out.println("The weight is"+this.weight);
           
      }
	

}