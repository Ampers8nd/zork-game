public class App {
    public static void main(String[] args) throws Exception {
        // play-area is a 4x4 grid, where the origin is the bottom-left corner. 
        // The bottom-left grid will be the entrance and has coordinates 0,0
        // init all object
        Player player = new Player(0,0);
        Monster monster = new Monster(3,3);
        // generating the breeze and smell from pits and monsters
        Smell smellOne = new Smell(monster.x-1, monster.y);
        Smell smellTwo = new Smell(monster.x+1, monster.y);
        Smell smellThree = new Smell(monster.x, monster.y+1);
        Smell smellFour = new Smell(monster.x, monster.y-1);

        System.out.println(smellFour.x);
        monster.health = 0;
        if (monster.health == 0) {
            monster.isDead = true;
        };

        if (player.x == monster.x && player.y == monster.y) {
            System.out.println("player is dead");
        } else {
            System.out.println("Player is not dead.");
        }
        System.out.println(monster.isDead);
    }
}