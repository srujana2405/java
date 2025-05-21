package day4;

public class project2 {

		private String firstName;
		private String lastName;
		private String emailId;
		private long phoneNumber;
		
		public void setFirstName(String fn) {
			firstName=fn;
		}
		public void setLastName(String ln) {
			lastName=ln;
		}
		public void setEmailId(String ei) {
			emailId=ei;
		}
		public void setPhoneNum(long l) {
			phoneNumber=l;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public long getPhoneNum() {
			return phoneNumber;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			project2 d1=new project2();
			d1.setFirstName("vikram");
			d1.setLastName("rathod");
			d1.setEmailId("srujana@gmail.com");
			d1.setPhoneNum(8309779798l);
			System.out.println(d1.getFirstName());
			System.out.println(d1.getLastName());
			System.out.println(d1.getEmailId());
			System.out.println(d1.getPhoneNum);

		}

	}
