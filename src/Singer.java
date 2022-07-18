public class Singer extends Person{
    public Singer (String name, int designation){
        super(name, designation);}

    private String bandName;

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


}
