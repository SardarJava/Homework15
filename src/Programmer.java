public class Programmer extends Person{
    public Programmer (String name, int designation){
        super(name, designation);}

    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private void code (){
        System.out.println("Coding in Java");}

        void coding (){code();}


}
