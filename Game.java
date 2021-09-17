public class Game {
    Gameboard gameboard;
    Player player1;
    Player player2;
    Player player3;
    Player player4;

    public Game(String color1, String color2, String color3, String color4){
        this.gameboard = new Gameboard();
        this.player1 = new Player(color1);
        this.player2 = new Player(color2);
        this.player3 = new Player(color3);
        this.player4 = new Player(color4);
        setStartingSpaces();
    };

    private void setStartingSpaces(){
        player1.setStartingSpace(0);
        player2.setStartingSpace(13);
        player3.setStartingSpace(26);
        player4.setStartingSpace(39);
    }

    public void playRound(){
        player1.movePiece(Dice.roll(), gameboard);
        player2.movePiece(Dice.roll(), gameboard);
        player3.movePiece(Dice.roll(), gameboard);
        player4.movePiece(Dice.roll(), gameboard);
    }

}
