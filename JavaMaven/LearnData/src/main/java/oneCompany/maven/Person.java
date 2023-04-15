package oneCompany.maven;

public class Person {
    public String name;
    public String country;
    public int age;
    
    Person(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    Person() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
