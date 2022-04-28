public class Main {
    public static void main(String[] args) {
        // Using un-encapsulated logic ( BAD PRACTICE! )
        Player player = new Player();
        player.name = "Tim";
        player.health = 100;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health: " + player.healthRemaining());

        // Using Encapsulation ( BETTER )
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 50, "sword");
        System.out.println("Blue Wizard health is: " + enhancedPlayer.getHitPoints());
    }
}