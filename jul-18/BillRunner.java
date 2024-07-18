class BillRunner{

public static void main(String b[]){	
	
	Bill ref=new Bill();
	boolean val =ref.createBill(1,"12/04/2002","12/06/2002",true,false);
	ref.displayBillInfo();
	
	Bill ref1=new Bill();
	val =ref1.createBill(2,"14/02/2006","11/08/2009",false,true);
	ref1.displayBillInfo();
	
	Bill ref2=new Bill();
	val =ref2.createBill(3,"22/11/2020","22/11/2021",true,false);
	ref2.displayBillInfo();
	
	Bill ref3=new Bill();
	val =ref3.createBill(4,"25/05/2022","24/07/2022",false,true);
	ref3.displayBillInfo();
	
	Bill ref4=new Bill();
	val =ref4.createBill(5,"22/06/2021","21/07/2022",true,false);
	ref4.displayBillInfo();
	
	Bill ref5=new Bill();
	val =ref5.createBill(6,"03/11/2020","21/07/2022",false,true);
	ref5.displayBillInfo();
	
	Bill ref6=new Bill();
	val =ref6.createBill(7,"12/06/2005","21/07/2005",true,false);
	ref6.displayBillInfo();
	
	Bill ref7=new Bill();
	val =ref7.createBill(8,"11/11/2011","1/07/2012",true,false);
	ref7.displayBillInfo();
	
	Bill ref8=new Bill();
	val =ref8.createBill(9,"2/02/2011","21/03/2012",false,true);
	ref8.displayBillInfo();
	
	Bill ref9=new Bill();
	val =ref9.createBill(10,"14/07/2004","21/06/2005",true,false);
	ref9.displayBillInfo();
	
	Bill ref10=new Bill();
	val =ref10.createBill(11,"12/01/2008","21/07/2022",false,true);
	ref10.displayBillInfo();
	
	Bill ref11=new Bill();
	val =ref11.createBill(12,"23/03/2021","11/07/2022",true,false);
	ref11.displayBillInfo();
	
	Bill ref12=new Bill();
	val =ref12.createBill(13,"15/06/2017","21/07/2018",false,true);
	ref12.displayBillInfo();
	
	Bill ref13=new Bill();
	val =ref13.createBill(14,"12/08/2021","22/07/2022",false,true);
	ref13.displayBillInfo();
	
	Bill ref14=new Bill();
	val =ref14.createBill(15,"2/06/2024","21/07/2025",true,false);
	ref14.displayBillInfo();
	
}

}