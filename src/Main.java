public class Main {
    public static void main(String[] args) {

        Person person = new Person("Sardarbek", 1);
        System.out.println(person);
        person.learning();
        person.eating();
        person.walking();
        System.out.println();

        Programmer programmer = new Programmer("James Gosling", 2);
        System.out.println(programmer);
        programmer.setCompanyName("Company name: " + "Java programming language");
        System.out.println(programmer.getCompanyName());
        programmer.learning();
        programmer.eating();
        programmer.walking();
        programmer.coding();
        System.out.println();

        Dancer dancer = new Dancer("Atai omurzakov", 3);
        System.out.println(dancer);
        dancer.setGroupName("Group name: " + "Tumar KR");
        System.out.println(dancer.getGroupName());
        dancer.learning();
        dancer.eating();
        dancer.walking();
        dancer.dancing();
        System.out.println();

        Singer singer = new Singer("Viktor Tsoy", 4);
        System.out.println(singer);
        singer.setBandName("Band name: " + "Kino");
        System.out.println(singer.getBandName());
        singer.learning();
        singer.eating();
        singer.walking();
        singer.singing();
        singer.playingGuitar();
    }
}