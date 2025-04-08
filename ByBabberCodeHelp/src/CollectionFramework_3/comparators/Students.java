package CollectionFramework_3.comparators;

public class Students implements Comparable<Students> {
    public int age;
    public String name;
    public int weight;

    public Students(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Students that) {

        // if both have weight name then we move to their name
        if(this.weight == that.weight)
            return that.name.compareTo(this.name);

        return this.weight - that.weight;
    }
}
