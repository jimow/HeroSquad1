import java.util.ArrayList;
import java.util.List;

public class Squad {

    private int maxSize;
    private String name;
    private String cause;
    private static List<Squad> instances = new ArrayList<>();
    private int id;
    private List<Hero> heroes;

    public Squad(int maxSize, String name, String cause) {
        this.maxSize = maxSize;
        this.name = name;
        this.cause = cause;
        instances.add(this);
        id = instances.size();
        heroes = new ArrayList<Hero>();

    }

    public String getName() {
        return name;
    }

    public String getCause () {
        return cause;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public static List<Squad> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public int getId() {

        return id;
    }
    public static Squad find( int id ) {
        return instances.get(id -1);

    }

    public List<Hero> getHeroes() {

        return heroes;
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }
}