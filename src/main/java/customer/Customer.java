package customer;

public class Customer {
	private int id;
	private String fname;
	private String lname;
	private String dob;
	private String gen;
	private String nic;
	private String country;
	private String passport;
	private String mail;
	private String phone;
	private String user;
	private String pwd;
	
	public Customer() {
		
	}

	public Customer(int id, String fname, String lname, String dob, String gen, String nic, String country,
			String passport, String mail, String phone, String user,String pwd) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.gen = gen;
		this.nic = nic;
		this.country = country;
		this.passport = passport;
		this.mail = mail;
		this.phone = phone;
		this.user = user;
		this.pwd = pwd;
		}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getDob() {
		return dob;
	}
	public String getGen() {
		return gen;
	}
	public String getNic() {
		return nic;
	}
	public String getCountry() {
		return country;
	}
	public String getPassport() {
		return passport;
	}
	public String getMail() {
		return mail;
	}
	public String getPhone() {
		return phone;
	}
	public String getUser() {
		return user;
	}
	public String getPwd() {
		return pwd;
	}

}
