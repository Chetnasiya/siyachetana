class Employee{
     String Emp_name, Emp_id, Address,Mail_id,Mobile_no;
     double Basic_pay;
     public Employee(String Emp_name,String Emp_id,String Address,String Mail_id,String Mobile_no,double Basic_pay){
        this.Emp_name=Emp_name;
        this.Emp_id=Emp_id;
        this.Address=Address;
        this.Mail_id=Mail_id;
        this.Mobile_no=Mobile_no;
        this.Basic_pay=Basic_pay;
     }
     void SalarySlipGeneration(){
        double da=(Basic_pay*97)/100;
        System.out.println("DA: "+da);
        double hra=(Basic_pay*10)/100;
        System.out.println("HRA: "+hra);
        double pf=(Basic_pay*12)/100;
        System.out.println("PF: "+pf);
        double staffClubFund=(Basic_pay*0.1f)/100;
        System.out.println("Staff club fund: "+staffClubFund);
     }
     void display(){
        System.out.println("Employee name: "+Emp_name);
        System.out.println("Employee id: "+Emp_id);
        System.out.println("Employee Address: "+Address);
        System.out.println("Employee mail id: "+Mail_id);
        System.out.println("Employee Mobile_no: "+Mobile_no);        
        System.out.println("Employee Basic_pay: "+ Basic_pay);        
        System.out.println("/n");
     }


}
class Programmer extends Employee{

    Programmer(String Emp_name,String Emp_id,String Address,String Mail_id,String Mobile_no,double Basic_pay){
        super(Emp_name, Emp_id, Address,Mail_id,Mobile_no,Basic_pay);
    }
}
class TeamLead  extends Employee{
    TeamLead(String Emp_name,String Emp_id,String Address,String Mail_id,String Mobile_no,double Basic_pay){
        super(Emp_name, Emp_id, Address,Mail_id,Mobile_no,Basic_pay);
    }

}
class AssistantProjectManager  extends Employee{
    AssistantProjectManager(String Emp_name,String Emp_id,String Address,String Mail_id,String Mobile_no,double Basic_pay){
        super(Emp_name, Emp_id, Address,Mail_id,Mobile_no,Basic_pay);
    }

}
class ProjectManager  extends Employee{
    ProjectManager(String Emp_name,String Emp_id,String Address,String Mail_id,String Mobile_no,double Basic_pay){
        super(Emp_name, Emp_id, Address,Mail_id,Mobile_no,Basic_pay);
    }

}
public class Hierarchy{
    public static void main(String args[]){
        Programmer p1=new Programmer("siya chetana","25","malegaon","siyachetana@gmail.com","7020762722",5000000);
        p1.display();
        p1.SalarySlipGeneration();

        TeamLead t1=new TeamLead("tanmay","25","akola","tanmaypatil@gmail.com","8783923972",10000000);
        t1.display();
        t1.SalarySlipGeneration();

        AssistantProjectManager a1=new AssistantProjectManager("chintan","25","shirpur","chintanjain@gmail.com","932240021",50000000);
        a1.display();
        a1.SalarySlipGeneration();

        ProjectManager m1=new ProjectManager("viraj","25","pimpalner","virajaacharya@gmail.com","9826357284",4000000);
        m1.display();
        m1.SalarySlipGeneration();

    }
}