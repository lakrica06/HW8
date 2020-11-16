import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Address<String> address1 = new Address<>("Minsk", "Sharangovicha" , 80);
        Address<String> address2 = new Address<>("Гродно", "Lenina", 5);
        Address<String> address3 = new Address<>("Минск", "Lobanka", 110);

        Person person1 = new Person("Danila", "Sagan", address1);
        Person person2 = new Person("Anna", "Leshina", address2);
        Person person3 = new Person("Andrey", "Borovik" , address3);
            Person person4 = new Person(null, "Lukin", address3);
        Person person5 = new Person("Alena", null, address2);
        Person person6 = new Person("Aleks", "Borov", null);

        ArrayList<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);

        List<String> modified = list
                .stream()
                .filter(Person -> Person.getName()!=null && Person.getLastName()!= null && Person.getAddress()!= null)
                .sorted((item1, item2) -> item2.getAddress().getNumber() - item1.getAddress().getNumber())
                .map(str -> str.toString())
                .collect(Collectors.toList());
        System.out.println(modified);
    }
}
