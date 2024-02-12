public class Encap {

}
class Emp{
    String empname = "Akmal";
    int empno = 230;
    String empaddress = "Sungavila";
}
class car{
    public static void main (String [] args){
        Emp e=new Emp();
        System.out.println("Employee Name :" + e.empname +"\n" + "Employee Address :" +e.empaddress + "\n"+"Employee Number:"
        +e.empno);
    }
}
