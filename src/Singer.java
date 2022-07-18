public class Singer extends Person{
    private String bandName;

    public Singer(String name, int designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    private void sing (){
        System.out.println("Singing");}
    private void playGuitar (){
        System.out.println("Playing on Guitar");
    }

    void singing (){sing();}
    void playingGuitar (){playGuitar();}

    @Override
    public String toString() {
        return "Singer{"  + super.toString() +
                " bandName: '" + bandName + '\'' +
                "} ";
    }
}
