class Employee
{
    static String company_name="TCS";
    int emp_id=12345;
    double emp_salary=321743.12;
    String emp_name="pranoti";
    static
    {
        System.out.println(company_name);
    }
    {
        System.out.println("=========Employee Details=============");
    }
    public void empDetails()
    {
        System.out.println("Employee name"+emp_name);
        System.out.println("Employee id"+emp_id);
        System.out.println("Employee salary"+emp_salary);
    }
    public static void main(String args)
    { 
        Employee e1=new Employee();
        e1.empDetails();
        Employee e2=new Employee();
        e2.emp_name="seema";
        e2.emp_id=123;
        e2.emp_salary=234324.2;
        e2.empDetails();


    }
}