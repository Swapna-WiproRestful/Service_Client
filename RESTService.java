package exceptionsinrest;

public class RESTService {
	 
	 static CallDB cdb = new CallDB();
	 
	 public static String checkCustomerStatus(String custId){
	 
	 MyData da = cdb.getStatus(custId);
	 
	 return da.getStatus().trim(); 
	 }
	}