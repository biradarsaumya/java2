class BarRunner{

public static void main(String[] shop){

boolean isAdded=Bar.addWineBrand("Fratelli");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Sula");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Grover La");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Big Banyan");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Charosa");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Dia Red Wine");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Krsma");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Vallonne");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("York");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Barefoot Cellars");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Castellare di");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Domaine De La");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Egon");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Grover");
System.out.println("is  added:"+isAdded);

 isAdded=Bar.addWineBrand("Lafite");
System.out.println("is  added:"+isAdded);

Bar.getWineBrands();

boolean newName=Bar.updateWineBrand("York","Yello Tail"); 
System.out.println("updated wine is:"+newName);
Bar.getWineBrands();

boolean deleteName=Bar.deleteWineBrand("York"); 
System.out.println("deleted wine is:"+deleteName);
Bar.getWineBrands();

}



}