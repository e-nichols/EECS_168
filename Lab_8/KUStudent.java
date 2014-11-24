public class KUStudent {
	
	private String stud_fname;
	private String stud_lname;
	private String stud_kuid;
	private String stud_dpt;

	/*
	Methods
	    set_name(String fname, String lname) // Set student's name.
	    set_kuinfo(String kuid, String dpt) // Set student's KUID and Department.
	    get_fname() // Get student's first name.
	    get_lname() // Get student's last name.
	    get_id() // Get student's id.
	    get_dept() // Get student's Department.
	*/	

	void set_name(String fname, String lname) {
		
		this.stud_fname = fname;
		
		this.stud_lname = lname;
		
	}
	
	public void set_kuinfo(String kuid, String dpt) {
		
		this.stud_kuid = kuid;
		
		this.stud_dpt = dpt;
	}
	
	public String get_fname() {
		
		return(this.stud_fname);
	}
	
	public String get_lname() {
		
		return(this.stud_lname);
	}
	
	public String get_id() {
		
		return(this.stud_kuid);
		
	}
	
	public String get_dept() {
		
		return(this.stud_dpt);
	}
}

