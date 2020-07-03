package EmailApplication.java;
import java.util.Scanner;
public class EmailApplication {
	private static final int Length = 0;
	public static void main(String[]args) {
		EmailApplication em1=new EmailApplication("Sakshi","Wasadikar");
	   System.out.println( em1.showInfo());
	}
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity =400;
	private String alternateEmail;
	private int defaultPasswordLength=11;
	private String email;
	private String companySuffix="XYZ.com";
	private String changePassword;
    //construct the first name and last name
	public EmailApplication(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email Created:"+this.firstName+""+this.lastName);
	
	this.department=setDepartment();
	System.out.println("Department :" +this.department);
	this.password=randomPassword(defaultPasswordLength);
	System.out.println("your password is:"+this.password);
	
	email= firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+ department + companySuffix;
	System.out.println("your email is:"+email);
}

	
	
	
	//ask for the department
	private String setDepartment() {
		System.out.println("enter the department\n1 for sales\n2 for account\n2 for developement\n4 for none");
		Scanner in=new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice==1) {
			return "sales";
			
		}
		else if(depChoice==2) {
			return "account";
			
		}
		else if(depChoice==3) {
		return "development";
		}
		else {
			return "";
			
		}

	}
	//generate random password
	private String randomPassword(int length) {
		String passwordset="ABCDEFGH12345@s.com";
		char[] password=new char[length];
		for(int i = 0;i< length;i++) {
		int rand=(int) (Math.random() * passwordset.length());
			password[i]=passwordset.charAt(rand);
			
		}
		return new String(password);
	}
	//check the mailboxcapacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity= capacity ;
	}
	//check the alternate email
	public void alternateEmail(String alternateEmail) {
		this.alternateEmail=alternateEmail;
	}
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
		public int getMailboxCapacity() { return mailBoxCapacity;}
		public String getAlternateEmail() { return alternateEmail;}
		public String getPassword() { return password;}
		public String showInfo() {
			return "Display Name:" + firstName+ "" + lastName+
					"\ncompany Email:"+email+
					"\nMail box Capacity:"+mailBoxCapacity+"mb";
		
			
		}
		
		
	}

