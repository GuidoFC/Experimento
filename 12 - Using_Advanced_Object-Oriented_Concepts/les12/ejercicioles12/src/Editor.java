public class Editor extends SkilledEmployee {
    public boolean prefersPaperEditing;

    public Editor(){

    }


    public Editor(String name, String jobTitle, int employeeID, int level, String [] skillList,boolean prefersPaperEditing){
        super(name, jobTitle, employeeID, level, skillList);
        this.prefersPaperEditing = prefersPaperEditing;
    }



    public void setPrefersPaperEditing(boolean b){
        this.prefersPaperEditing = prefersPaperEditing;
    }

    public boolean getPrefersPaperEditing(){
        return this.prefersPaperEditing;
    }



    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println(" Prefiere edita a papel: " + this.prefersPaperEditing);
    }
}
