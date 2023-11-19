public class Player {
  // the player always starts at 0
  int x;
  int y;
  int arrows = 1;
  boolean isDead = false;

  public Player(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  public void fireArrow() {
    arrows--;

  }
  public void getItem(int inventory) {
    // needs to also store the items
    inventory++;
  }
}
