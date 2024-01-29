package My_Aop;

public class student_pojo_class {
 int Rollnum;
 String Name;
 String fee_paid;
 
 
public student_pojo_class() {
	super();
	// TODO Auto-generated constructor stub
}


public student_pojo_class(int rollnum, String name, String fee_paid) {
	super();
	Rollnum = rollnum;
	Name = name;
	this.fee_paid = fee_paid;
}


public int getRollnum() {
	return Rollnum;
}


public void setRollnum(int rollnum) {
	Rollnum = rollnum;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public String getFee_paid() {
	System.out.println("Fee Paid By Student  "+ fee_paid);
	return fee_paid;
}


public void setFee_paid(String fee_paid) {
	this.fee_paid = fee_paid;
}

public void display()
{
	System.out.println("\nstudent_pojo_class [Rollnum=" + Rollnum + ", Name=" + Name + ", fee_paid=" + fee_paid + "]\n");
	
}


@Override
public String toString() {
	return "student_pojo_class [Rollnum=" + Rollnum + ", Name=" + Name + ", fee_paid=" + fee_paid + "]";
}



 
 
}

