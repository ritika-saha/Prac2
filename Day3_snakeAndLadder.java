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
        //for single player
       // int position=0;
        //gamePlay gp=new gamePlay(position);
        //while(gp.position<100){
          //  gp.play();
        //}

            //for double Player doublePlayer_SnL branch
            int position1=0;
            int position2=0;
            gamePlay gp1=new gamePlay(position1);
            gamePlay gp2=new gamePlay(position2);
            int turn=1;
            while(gp1.position<100 && gp2.position<100){
                if(turn==1){
                    turn=2;
                    System.out.println("---------------------PLAYER 1-------------------");
                    gp1.play();
                }
                 else if(turn==2){
                    turn=1;
                    System.out.println("---------------------PLAYER 2-------------------");
                    gp2.play();
                }
            }
        if(gp1.position==100){
        System.out.println("WINNER IS PLAYER 1");
        }else if(gp2.position==100){
            System.out.println("WINNER IS PLAYER 2");
        }
        System.out.println("Number of dice rolls for player 1 :"+gp1.diceRollNum);
        System.out.println("Number of dice rolls for player 1 :"+gp2.diceRollNum);
    }
}