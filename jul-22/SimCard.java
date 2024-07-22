class SimCard{

   String brandName;
   int id;
   String plan;
   
public SimCard(String brandName,int id,String plan){
               
                System.out.println("SimCard started");
                 this.brandName = brandName;
                 this.id   = id;
                 this.plan = plan ;
                System.out.println("SimCard ended"); 
                 
               }
      
public void displaySimCardInfo(){
           System.out.println("The  brand name is"+this.brandName);
           System.out.println("The id is"+this.id);
           System.out.println("The plan is"+this.plan);
           
      }
	

}