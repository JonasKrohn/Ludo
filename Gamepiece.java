public class Gamepiece {
    String name;
    boolean isOut;

    public Gamepiece(String name){
        this.name = name;
        this.isOut = false;
    }

    public boolean isOut(){
        return isOut;
    }

    public void moveOut(){
        isOut = true;
    }

    public void moveIn(){
        isOut = false;
    }
}
