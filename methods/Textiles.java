import java.util.*;
class Textiles{

static String materials[]={null,null,null,null,null,null};
static int index;

    public static boolean addMaterial(String materialName){

         System.out.println("add material  started");
           boolean isMaterialAdded=false;
		   
              if(material!=null){
                 materials[index]=material;
                 index++;
           isMaterialAdded=true;
             }else System.out.println("material is null,can not be determined");
        System.out.println("add material ended");
		return isMaterialAdded;
}
         public static void getAllMaterialInfo(){
		   System.out.println("the available materials are:");
		    for(String material:materials)
			 System.out.println(material);
			 }

public static boolean updateMaterial(String oldMaterial,String newMaterial){

         System.out.println("update Material  started");
		   boolean isMaterialUpdated=false;
		    for(int index=0; index<materials.length; index++){
			 if(oldMaterial==materials[index]){
			    materials[index]=newMaterial;
				 isMaterialUpdated=true;
				 }
			   }
			  if(isMaterialUpdated==false){
			   System.out.println(oldMaterial+"not found");
			  }
		 System.out.println("update Material ended");
           return isMaterialUpdated;
}
 public static boolean deleteMaterial(String materialTobeDeleted){
	System.out.println("delete  Material started");
	  boolean isMaterialDeleted=false;
	  int newIndex,oldIndex;
	   for(newIndex=0,oldIndex=0;oldIndex<materials.length; oldIndex++){
		  if(materials[oldIndex]!=materialTobeDeleted){
			  
			  materials[newIndex]=materials[oldIndex];
			  newIndex++;
			  } 
		   }
		   materials=Arrays.copyOf(materials,newIndex);
		   if(materials!=null){
			   isMaterialDeleted=true;
		   }
		   if(isMaterialDeleted==false){
			   System.out.println(materialTobeDeleted+"not found");
		   }
	
	System.out.println("delete Material  ended");
	return isMaterialDeleted;
	}		    
}