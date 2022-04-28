public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; ++i) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        // Generates random movie using RNG, 3 being the movies we created
        // Adding one as it could truncate to 0
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
                // don't need a break as we are returning!
            case 2:
                return new IndependenceDay();
            case 3:
                return new Forgettable();
        }
        return null; // could also be handled via the "default" case in switch statement
    }
}