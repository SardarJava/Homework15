public class Dancer extends Person{

    private String groupName;

    public Dancer(String name, int designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    private void dance (){
        System.out.println("Dancing");}

    void dancing (){dance();}

    @Override
    public String toString() {
        return "Dancer{" + super.toString() +
                " groupName: '" + groupName + '\'' +
                "} ";
    }
}
