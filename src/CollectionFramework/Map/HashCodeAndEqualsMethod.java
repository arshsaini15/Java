package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person {
    int id;
    String name;

    Person(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;

        Person other = (Person) obj;
        return id ==  other.id && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        Map<Person, String> mp = new HashMap<>();

        Person p1 = new Person("Alice", 1); // hashcode -> index1
        Person p2 = new Person("John", 2); // hashcode -> index2
        Person p3 = new Person("Alice", 1); // hashcode -> index1 -> equals() -> replace

        mp.put(p1, "Employee");
        mp.put(p2, "Manager");
        mp.put(p3, "HR");

        System.out.println(mp.size());
        System.out.println(mp.values());
    }
}
