import java.util.*;
class Liberty{

static String shoeBrands[]={null,null,null,null,null,null};
static int index;

    public static boolean addShoeBrand(String brandName){

         System.out.println("add shoe brand started");
           boolean isShoeBrandAdded=false;
		   
              if(shoeBrand!=null){
                 shoeBrands[index]=shoeBrand;
                 index++;
           isShoeBrandAdded=true;
             }else System.out.println("shoe brand is null,can not be determined");
        System.out.println("add shoe brand ended");
		return isShoeBrandAdded;
}
         public static void getShoeBrands(){
		   System.out.println("the available shoes are:");
		    for(String shoeBrand:shoeBrands)
			 System.out.println(shoeBrand);
			 }

public static boolean updateShoeBrand(String oldShoeBrand,String newShoeBrand){

         System.out.println("update shoe Brand started");
		   boolean isShoeBrandUpdated=false;
		    for(int index=0; index<shoeBrands.length; index++){
			 if(oldShoeBrand==shoeBrands[index]){
			    shoeBrands[index]=newShoeBrand;
				 isShoeBrandUpdated=true;
				 }
			   }
			  if(isShoeBrandUpdated==false){
			   System.out.println(oldShoeBrand+"not found");
			  }
		 System.out.println("update shoe Brand ended");
           return isShoeBrandUpdated;
}
 public static boolean deleteShoeBrand(String ShoeBrandTobeDeleted){
	System.out.println("delete ShoeBrand  started");
	  boolean isShoeBrandDeleted=false;
	  int newIndex,oldIndex;
	   for(newIndex=0,oldIndex=0;oldIndex<shoeBrands.length; oldIndex++){
		  if(shoeBrands[oldIndex]!=shoeBrandTobeDeleted){
			  
			  shoeBrands[newIndex]=ShoeBrands[oldIndex];
			  newIndex++;
			  } 
		   }
		   shoeBrands=Arrays.copyOf(shoeBrands,newIndex);
		   if(shoeBrands!=null){
			   isShoeBrandDeleted=true;
		   }
		   if(isShoeBrandDeleted==false){
			   System.out.println(shoeBrandTobeDeleted+"not found");
		   }
	
	System.out.println("delete ShoeBrand ended");
	return isShoeBrandDeleted;
	}		    
}