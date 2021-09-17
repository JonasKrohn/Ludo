import java.util.Arrays;
import java.util.List;

public  class Gameboard{

List<Gamepiece> places;

public Gameboard(){
this.places = Arrays.asList(new Gamepiece[51]);
}


public List<Gamepiece> getBoard(){
    return places;
}


}
