package poly.org;

public class Details {
		//method Overloading
		//datatyp
		public void empid(int empid, double sal, String empname) {
			System.out.println("Empolyee Id: "+empid+"\nSalary :"+sal+"\nName :"+empname);
		}
		//datatype count
		public void empid(String address,String email, String city) {
			System.out.println("Address: "+address+"Email :"+email+"\nCity :"+city);
		}
		
		public static void main(String[] args) {
			Details e = new Details();
			e.empid(670126,342,"Vikram");
			e.empid("ooty", "ramvikram93@gamilc.com","Coimbatore");
		}

	}


