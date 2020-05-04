import java.util.ArrayList;
import java.util.List;
public class Hero {

    private String name;
    private int age;
    private String specialPowers;
    private String  weakness;
    private static List<Hero> instances = new ArrayList<>();
    private int id;


    public Hero (String name, int age, String specialPowers, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPowers = specialPowers;
        this.weakness = weakness;
        instances.add(this);
        id = instances.size();

    }

    public int getAge( ) {
        return age;
    }
    public String getName () { return name; }
    public String getSpecialPowers( ) {
        return specialPowers;
    }
    public String getWeakness( ) {
        return weakness;
    }
    public static List<Hero> all() {
        return instances;
    }

    public int getId() {
        return id;
    }
    public static boolean findHeroByName(String name)
    {
        boolean isAvailable = false;
        for (int i =0; i<instances.size(); i++)
        {
            if (name.equalsIgnoreCase(instances.get(i).name) )
            {
                isAvailable = true;
            }
        }

        return isAvailable;
    }
    public static Hero find( int id) {
        try {
            return instances.get(id - 1);
        } catch (IndexOutOfBoundsException exc) {
            return null;
        }
    }

    public static void clear() {
        instances.clear();
    }
}