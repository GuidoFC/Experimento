import java.util.*;

public class Manager extends EmployeeTest{
    private ArrayList employeeList = new ArrayList(); // si uso el ArrayList tengo que poner  import java.util.*;

    public Manager(){

    }

    public void setListaEmployee() {
        this.employeeList = employeeList;
    }


    // no entiendo este codigo pag. 131 activity guide
    public void setEmployee(Employee emp){
        employeeList.add(emp);
    }


    public ArrayList getEmployees() {
        return employeeList;
    }
}

