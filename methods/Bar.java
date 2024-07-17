import java.util.*;
class Bar{

static String wineBrands[]={null,null,null,null,null,null};
static int index;

    public static boolean addWineBrand(String wineBrand){

         System.out.println("add wine brand started");
           boolean isWineBrandAdded=false;
		   
              if(wineBrand!=null){
                 wineBrands[index]=wineBrand;
                 index++;
           isWineBrandAdded=true;
             }else System.out.println("wine brand is null,can not be determined");
        System.out.println("add wine brand ended");
		return isWineBrandAdded;
}
         public static void getWineBrands(){
		   System.out.println("the available wines are:");
		    for(String wineBrand:wineBrands)
			 System.out.println(wineBrand);
			 }

public static boolean updateWineBrand(String oldWineBrand,String newWineBrand){

         System.out.println("update wine Brand started");
		   boolean isWineBrandUpdated=false;
		    for(int index=0; index<wineBrands.length; index++){
			 if(oldWineBrand==wineBrands[index]){
			    wineBrands[index]=newWineBrand;
				 isWineBrandUpdated=true;
				 }
			   }
			  if(isWineBrandUpdated==false){
			   System.out.println(oldWineBrand+"not found");
			  }
		 System.out.println("update wine Brand ended");
           return isWineBrandUpdated;
}
public static boolean deleteWineBrand(String wineBrandTobeDeleted){
	System.out.println("delete WineBrand  started");
	  boolean isWineBrandDeleted=false;
	  int newIndex,oldIndex;
	   for(newIndex=0,oldIndex=0;oldIndex<wineBrands.length; oldIndex++){
		  if(wineBrands[oldIndex]!=wineBrandTobeDeleted){
			  
			  wineBrands[newIndex]=wineBrands[oldIndex];
			  newIndex++;
			  } 
		   }
		   wineBrands=Arrays.copyOf(wineBrands,newIndex);
		   if(wineBrands!=null){
			   isWineBrandDeleted=true;
		   }
		   if(isWineBrandDeleted==false){
			   System.out.println(wineBrandTobeDeleted+"not found");
		   }
	
	System.out.println("delete WineBrand  ended");
	return isWineBrandDeleted;
	}		
     
}