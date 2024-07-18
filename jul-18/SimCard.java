class SimCard{

   String brandName;
   int id;
   String plan;
   
public boolean createSimCard(String brandName,int id,String plan){
               
                boolean isSimCardCreated = false;
                if(brandName!=null && id > 0 && plan!=null){
                 this.brandName = brandName;
                 this.id   = id;
                 this.plan = plan ;
                 
                 isSimCardCreated = true ; 
                }
                
                return isSimCardCreated ; 
      }
      
public void displaySimCardInfo(){
           System.out.println("The  brand name is"+this.brandName);
           System.out.println("The id is"+this.id);
           System.out.println("The plan is"+this.plan);
           
      }
	

}