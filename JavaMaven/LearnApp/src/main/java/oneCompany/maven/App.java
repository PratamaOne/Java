package oneCompany.maven;

import com.google.gson.Gson;

public class App {
    public static void main( String[] args )
    {
        Gson gson = new Gson();

        Person person = new Person();
        person.setName("Son Chaeyoung");
        person.setCountry("South Korea");
        person.setAge(23);

        String json = gson.toJson(person);

        System.out.println(json);
    }
}
