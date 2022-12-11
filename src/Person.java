public class Person {
    private String name;
    private String surname;
    private int amountOfTickets;

    public Person(String name, String surname, int amountOfTickets) {
        this.name = name;
        this.surname = surname;
        this.amountOfTickets = amountOfTickets;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void wasAtAttraction() {
        amountOfTickets -= 1;
    }

    public int getAmountOfTickets() {
        return amountOfTickets;
    }
}
