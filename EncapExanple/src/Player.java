public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println(" Y O U   D I E D");
            // Reduce player's lives
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
