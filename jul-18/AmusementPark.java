class AmusementPark{

	String name;
    int id;
    String place;
	
public boolean createAmusementPark(String name,int id,String place){
               
                boolean isGardenCreated = false;
                if(name!=null && id > 0 && place!=null){
                 this.name = name;
                 this.id   = id;
                 this.place = area ;
                 
                 isAmusementParkCreated = true ; 
                }
                
                return isAmusementParkCreated ; 
      }
      
public void displayAmusementParkInfo(){
           System.out.println("The name is"+this.name);
           System.out.println("The id is"+this.id);
           System.out.println("The place is"+this.place);
           
      }
	

}