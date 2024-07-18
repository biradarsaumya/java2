class AtmMachine{

   String name;
   int id;
   String type;
   
	
public boolean createAtmMachine(String name,int id,String type){
               
                boolean isAtmMachineCreated = false;
                if(name!=null && id > 0 && type!=null){
                 this.name = name;
                 this.id   = id;
                 this.type = type ;
                 
                 isAtmMachineCreated = true ; 
                }
                
                return isAtmMachineCreated ; 
      }
      
public void displayAtmMachineInfo(){
           System.out.println("The name is"+this.name);
           System.out.println("The id is"+this.id);
           System.out.println("The type is"+this.type);
           
      }
	

}