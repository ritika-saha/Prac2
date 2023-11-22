import java.util.Random;
class gamePlay {
 
    int diceRollNum=0;
    int position=0;
    public gamePlay(int p){
        position=p;
    }
    public int diceRoll(){
         Random random = new Random();
        int randomNumber = random.nextInt(( 6- 1) + 1) + 1;
        diceRollNum++;
        return randomNumber;
    }
  void play() {
    int moves = diceRoll();
    Random random = new Random();
    int option = random.nextInt((3 - 1) + 1) + 1;
    if (option == 1) {
        System.out.println("-------No Moves------");
    } else if (option == 2) {
        System.out.println("------Ladder!-----");
        if (position + moves <= 100)
            position += moves;
    } else if (option == 3) {
        System.out.println("------Snake!-------");
        if (position - moves < 0)
            position = 0;
        else
            position -= moves;
    }
    System.out.println("Final Position: " + position);
}



}
public class Day3_snakeAndLadder {

    public static void main(String[] args){
        //for single player singlePlayer_SnL branch
        int position=0;
        gamePlay gp=new gamePlay(position);
        while(gp.position<100){
            gp.play();
         }
        
        System.out.println("Number of dice rolls :"+gp.diceRollNum);
    }
}