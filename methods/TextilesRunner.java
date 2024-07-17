class TextilesRunner{

public static void main(String[] shop){

boolean isAdded=Textiles.addMaterial("Wool");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Silk");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Cotton");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Flax");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Jute");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Asbestos");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Glass Fibre");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Nylon");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Polyster");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Acrylic");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Polymide");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Yarns");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Denim");
System.out.println("is  added:"+isAdded);

isAdded=Textiles.addMaterial("Crepe");
System.out.println("is  added:"+isAdded);


Textiles.getAllMaterialInfo();

boolean newName=Textiles.getAllMaterialInfo("Denim","Damask"); 
System.out.println("updated matrial is:"+newName);
Textiles.getAllMaterialInfo();

boolean deleteName=Textiles.getAllMaterialInfo("Denim"); 
System.out.println("deleted matrial is:"+deleteName);
Textiles.getAllMaterialInfo();
}



}