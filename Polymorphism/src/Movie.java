// Note: classes should get their own file, this is bad practice done to follow the exercise
public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No Plot";
    }

    public String getName() {
        return name;
    }
}
