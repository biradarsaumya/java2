class Garden{

	String name;
    int id;
    String area;
	
public boolean createGarden(String name,int id,String area){
               
                boolean isGardenCreated = false;
                if(name!=null && id > 0 && area!=null){
                 this.name = name;
                 this.id   = id;
                 this.area = area ;
                 
                 isGardenCreated = true ; 
                }
                
                return isGardenCreated ; 
      }
      
public void displayGardenInfo(){
           System.out.println("The name is"+this.name);
           System.out.println("The id is"+this.id);
           System.out.println("The area is"+this.area);
           
      }
	

}