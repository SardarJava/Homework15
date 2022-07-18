public class Person {

    private String name;
    private int designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDesignation() {
        return designation;
    }

    public void setDesignation(int designation) {
        this.designation = designation;
    }

    public Person (String name, int designation){
        this.name = name;
        this.designation = designation;
    }


    private void learn (){
        System.out.println("learning");}
    private void eat (){
        System.out.println("Eating");}
    private void walk (){
    System.out.println("Walking");}



    @Override
    public String toString (){
        return "Name: " + name + "  Designation: " + designation;
    }
    void learning (){learn();}
    void eating (){eat();}
    void walking () {walk();}



    }
