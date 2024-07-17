class RedChilliesEntertainmentRunner{


public static void main(String[] chat){

boolean isAdded=RedChilliesEntertainment.createmovieActorName("Sharukh Khan");
System.out.println("is Sharukh Khan added:"+ isAdded);


isAdded=RedChilliesEntertainment.createmovieActorName("Taapsee Pannu ");
System.out.println("is Taapsee Pannu added:"+ isAdded);

isAdded=RedChilliesEntertainment.createmovieActorName("Amir Khan ");
System.out.println("is Amir Khan added:"+ isAdded);

isAdded=RedChilliesEntertainment.createmovieActorName("Juhi Chawla ");
System.out.println("is Juhi Chawla added:"+ isAdded);

isAdded=RedChilliesEntertainment.createmovieActorName("Gowri Khan");
System.out.println("is Gowri Khan added:"+ isAdded);

isAdded=RedChilliesEntertainment.createmovieActorName("Deepika Padkone ");
System.out.println("is Deepika Padkone added:"+ isAdded);

isAdded=RedChilliesEntertainment.createmovieActorName("Aliaa Bhatt ");
System.out.println("is Aliaa Bhatt added:"+ isAdded);

isAdded=RedChilliesEntertainment.createmovieActorName("Kajol");
System.out.println("is Kajol added:"+ isAdded);

isAdded=RedChilliesEntertainment.createmovieActorName("Vijay Thalapati ");
System.out.println("is Vijay Thalpati added:"+ isAdded);



RedChilliesEntertainment.getmovieActorNames();

boolean newName=RedChilliesEntertainment.updateMovieActorsName("Gowri Khan","Sidhharth Malhotra");
System.out.println("update movie actor name:"+newName);


RedChilliesEntertainment.getmovieActorNames();

boolean deleteName=RedChilliesEntertainment.deleteMovieActorName("Gowri Khan");
System.out.println("delete movie actor name:"+deleteName);

RedChilliesEntertainment.getmovieActorNames();








}
}