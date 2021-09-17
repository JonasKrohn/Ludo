import java.util.Random;

public class Player {
    
String color;
Gamepiece[] pieces;
int points = 0;
int startingSpace = 0;

public Player(String color){
    this.color = color;
    this.pieces = new Gamepiece[4];
    setupPieces();
}

private void setupPieces(){
    for(int i = 0; i<4; i++){
        pieces[i] = new Gamepiece(color + (i+1));
    }
};

public int getPoints(){
    return points;
}

public void incrementPoints(){
    points++;
}

public void setStartingSpace(int space){
    startingSpace = space;
}

public void movePiece(int roll, Gameboard board){
    int random = new Random().nextInt(pieces.length);
    Gamepiece piece = pieces[random];
    
    if (!(board.getBoard().contains(piece))){
        piece.moveOut();

        board.getBoard().set(((startingSpace - 1) + roll), piece);
    }
    else{
        int oldspace = board.getBoard().indexOf(piece);
        board.getBoard().set(oldspace, null);
        int newspace = oldspace+roll;
        if (newspace > 50){
            newspace = newspace-50;
        }
        if (board.getBoard().get(newspace) != null){
            board.getBoard().get(newspace).moveIn();
            System.out.println("get fukkkkd");
        }
        board.getBoard().set(newspace, piece);

    }
    
}

}
