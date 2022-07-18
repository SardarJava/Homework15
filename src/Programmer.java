public class Programmer extends Person{

    private String companyName;

    public Programmer(String name, int designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private void code (){
        System.out.println("Coding in Java");}

        void coding (){code();}

    @Override
    public String toString() {
        return "Programmer{"  + super.toString() +
                " companyName: '" + companyName + '\'' +
                "} ";
    }
}

