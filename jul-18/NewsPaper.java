class NewsPaper{

   String companyName;
   int id;
   int noOfPages;
   String language;
   
public boolean createNewsPaper(String companyName,int id,String area){
               
                boolean isNewsPaperCreated = false;
                if(companyName!=null && id > 0 && noOfPages>0 && language!=null){
                 this.companyName = companyName;
                 this.id   = id;
                 this.noOfPages =noOfPages;
				 this.language=language;
                 
                 isNewsPaperCreated = true ; 
                }
                
                return isNewsPaperCreated ; 
      }
      
public void displayNewsPaperInfo(){
           System.out.println("The company Name is"+this.companyName);
           System.out.println("The id is"+this.id);
           System.out.println("The no Of Pages "+this.noOfPages);
		   System.out.println("The language is"+this.language);
           
      }
	

}