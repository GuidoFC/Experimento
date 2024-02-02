public class Employee {

    protected static int employeeIDCounter = 0;
    private String name;
    private String jobTitle;
    private int employeeID;
    private int level;


    public void setName(){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setJobTitle(){
        this.jobTitle = jobTitle;
    }

    public String getJobTitle(){
        return this.jobTitle;
    }

    public int getEmployeeID(){
        return this.employeeID;
    }

    public void setLevel(){
        this.level = level;
    }

    public int getLevel(){
        return this.level;
    }

    public void calculateEmployeeID(){
        employeeIDCounter ++;
        // ??? setEmployeeID(employeeIDCounter);
    }


    public void displayInformation(){
        System.out.println("nombre" + getName());
        System.out.println(getEmployeeID());
        System.out.println(getJobTitle());
        System.out.println(getLevel());
    }

}
