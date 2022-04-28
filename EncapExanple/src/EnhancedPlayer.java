public class EnhancedPlayer {
    private String name;
    private int hitPoints;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 200) {
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            System.out.println(" Y O U   D I E D");
            // Reduce player's lives
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
