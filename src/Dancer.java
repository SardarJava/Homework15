public class Dancer extends Person{
    public Dancer (String name, int designation){
        super(name, designation);}

    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    private void dance (){
        System.out.println("Dancing");}

    void dancing (){dance();}


}
