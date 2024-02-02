public class SkilledEmployee extends EmployeeTest{

    public String [] skillList = new String[100];

    public void setSkillList(){
        this.skillList = skillList;
    }

    public String [] getSkillList(){
        return this.skillList;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println(this.skillList);
    }
}
