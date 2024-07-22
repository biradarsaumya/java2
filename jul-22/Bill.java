class Bill{
	
	int billId;
	String billIssueDate; 
    String billDueDate; 
	boolean isBillPaid ;
	boolean isLatestBill;
	
public Bill(int billId,String billIssueDate,String billDueDate,boolean isBillPaid,boolean isLatestBill){
               
               System.out.println("Bill started"); 
                 this.billId = billId;
                 this.billIssueDate = billIssueDate;
                 this.billDueDate = billDueDate;
                 this.isBillPaid = isBillPaid;
                 this.isLatestBill = isLatestBill;
               System.out.println("Bill ended");  
                
 }
      
      
public void displayBillInfo(){
           System.out.println("The Bill Id is "+ this.billId);
           System.out.println("The Bill Issue Date is "+ this.billIssueDate);
           System.out.println("The Bill Due Date is "+ this.billDueDate);
           System.out.println("Is Bill Paid "+ this.isBillPaid);
           System.out.println("Is Bill Latest "+ this.isLatestBill);
      }
	

}