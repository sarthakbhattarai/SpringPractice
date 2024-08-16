package Inheritence;

public class Organization {

    String orgname;
    String orgDate;

    public Organization(String orgname, String orgDate) {
        this.orgname = orgname;
        this.orgDate = orgDate;
    }

    public String getOrgDate() {
        return orgDate;
    }
    public String getOrgname() {
        return orgname;
    }
}

class HrEmployee extends Organization{


    String a="hello";
    static HrEmployee emp = new HrEmployee("train us","2022");

    public HrEmployee(String orgname, String orgDate) {
        super(orgname, orgDate);
    }

    public String getA() {
        return a;
    }

    public static void main(String[] args) {
        System.out.println(emp.getOrgDate());
        System.out.println(emp.getOrgname());
    }

}

//class GetA extends Employee{
//    static GetA a= new GetA();
//
//    public GetA(String orgname, String orgDate) {
//        super(orgname, orgDate);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(a.getA());
//        System.out.println(a.getOrgname());
//        System.out.println(a.getOrgDate());
//    }
//
//}