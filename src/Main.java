import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()) {
            Person personPoll = queue.poll();
            System.out.println(personPoll.getName() + " " + personPoll.getSurname() + " прокатился на аттракционе.");
            personPoll.wasAtAttraction();
            if (personPoll.getAmountOfTickets() > 0) {
                queue.add(personPoll);
            }

        }
    }

    public static List<Person> generateClients() {
        return List.of(
                new Person("Vasya", "Petrov", 3),
                new Person("Olya", "Vaskina", 1),
                new Person("Petya", "Ivanov", 5),
                new Person("Sasha", "Vavilonov", 7),
                new Person("Sergey", "Lasarev", 10)
        );
    }
}
