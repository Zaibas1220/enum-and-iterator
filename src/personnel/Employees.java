package personnel;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> people;

    public Employees() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public void add(List<Person> people) {
        for (Person person : people) {
            this.people.add(person);
        }
    }

    public void print() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public void print(Education education) {
        Iterator<Person> personIterator = people.iterator();

        while(personIterator.hasNext()) {
            Person person = personIterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> personIterator = people.iterator();

        while(personIterator.hasNext()) {
            Person person = personIterator.next();
            if (person.getEducation() == education) {
                people.remove(person);
            }
        }
    }
}
