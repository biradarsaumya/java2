class LibertyRunner{

public static void main(String[] shop){

boolean isAdded=Liberty.addShoeBrand("Skechers");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Adidas");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Bata");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Nike");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Puma");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("New Balance");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Reebok");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Vans");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Birkenstock");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Converse");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Fila");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Sorel");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Woodland");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Cole Haan");
System.out.println("is  added:"+isAdded);

isAdded=Liberty.addShoeBrand("Lee Cooper");
System.out.println("is  added:"+isAdded);



Liberty.getShoeBrands();

boolean newName=Liberty.getShoeBrands("Converse","Red Tape"); 
System.out.println("updated shoe is:"+newName);
Liberty.getShoeBrands();

boolean deleteName=Liberty.getShoeBrands("Converse"); 
System.out.println("deleted shoe is:"+deleteName);
Liberty.getShoeBrands();


}



}