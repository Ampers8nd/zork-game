public class App {
    public static void main(String[] args) throws Exception {
        // play-area is a 4x4 grid, where the origin is the bottom-left corner. 
        Object[] arena = new Object[4][4];
        // The bottom-left grid will be the entrance and has coordinates 0,0
        // init all objects

        Player player = new Player(0,0);
        Monster monster = new Monster(3,3);
        // generating the breeze and smell from pits and monsters
        Smell smellOne = new Smell(monster.getX()-1, monster.getY());
        Smell smellTwo = new Smell(monster.getX()+1, monster.getY());
        Smell smellThree = new Smell(monster.getX(), monster.getY()+1);
        Smell smellFour = new Smell(monster.getX(), monster.getY()-1);


        // code will continue to run while player is alive 
        while (player.isDead != false) {
            

            if (player.getX() == monster.getX() && player.getX() == monster.getX()) {
                System.out.println("You've died to the monster!");
                break;
            }
        }
    }
}
