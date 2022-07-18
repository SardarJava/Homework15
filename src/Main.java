public class Main {
    public static void main(String[] args) {

        Person person = new Person("Sardarbek", 1);
        System.out.println(person);
        person.toString();
        person.learning();
        person.eating();
        person.walking();
        System.out.println();

        Programmer programmer = new Programmer("James Gosling", 2 , " Java programming language");
        System.out.println(programmer);
        programmer.toString();
        programmer.learning();
        programmer.eating();
        programmer.walking();
        programmer.coding();
        System.out.println();

        Dancer dancer = new Dancer("Atai omurzakov", 3, "Tumar KR");
        System.out.println(dancer);
        dancer.toString();
        dancer.learning();
        dancer.eating();
        dancer.walking();
        dancer.dancing();
        System.out.println();

        Singer singer = new Singer("Viktor Tsoy", 4, "Kino");
        System.out.println(singer);
        singer.toString();
        singer.learning();
        singer.eating();
        singer.walking();
        singer.singing();
        singer.playingGuitar();
    }
}