import java.util.Arrays;
class RedChilliesEntertainment{

   static String name="Om";
   static String ownerName="Basava";
   static String movieActorNames[]={null,null,null,null,null,null,null,null,null};
   static int index;
 
   
//add chatName in chatNames index positions(ref)

   public static boolean createmovieActorName(String movieActorName){
     System.out.println(" create movie Actor Name started");
      boolean ismovieActorNameCreated=false;
	  //validation
         if(movieActorName !=null){
          movieActorNames[index]=movieActorName;
	      index++;
	ismovieActorNameCreated=true;
	}else System.out.println("movie Actor name is null,cannot be determined");
	 System.out.println("creat movie Actor Name ended");
	 
   return ismovieActorNameCreated;
  }
  

  
  public static void getmovieActorNames(){
	 System.out.println("the available movie Actor Names are:");
       for(String movieActorName:movieActorNames)
     System.out.println(movieActorName);		   
	  
  }
  public static boolean updateMovieActorsName(String oldMovieActorName,String newMovieActorName){
	
  System.out.println("update Movie Actor name started");
  boolean isMovieActorNameUpdated = false;
    for(int index=0; index<movieActorNames.length;index++){
       if(oldMovieActorName== movieActorNames[index]){
	     movieActorNames[index]=newMovieActorName;
	        isMovieActorNameUpdated=true;
}
	
}  
	if(isMovieActorNameUpdated==false){
		System.out.println(oldMovieActorName+"not found");
		}
		
		System.out.println("udpdate Movie Actor Name ended");
		return isMovieActorNameUpdated;
		
		}
		public static boolean deleteMovieActorName(String movieActorNameTobeDeleted){
	System.out.println("delete MovieActorName name started");
	  boolean isMovieActorNameDeleted=false;
	  int newIndex,oldIndex;
	   for(newIndex=0,oldIndex=0;oldIndex<movieActorNames.length; oldIndex++){
		  if(movieActorNames[oldIndex]!=movieActorNameTobeDeleted){
			  
			  movieActorNames[newIndex]=movieActorNames[oldIndex];
			  newIndex++;
			  } 
		   }
		   movieActorNames=Arrays.copyOf(movieActorNames,newIndex);
		   if(movieActorNames!=null){
			   isMovieActorNameDeleted=true;
		   }
		   if(isMovieActorNameDeleted==false){
			   System.out.println(movieActorNameTobeDeleted+"not found");
		   }
	
	System.out.println("delete MovieActorName name ended");
	return isMovieActorNameDeleted;
	}		
}
  

	


 


