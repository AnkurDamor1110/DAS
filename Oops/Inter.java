package Oops;

public class Inter {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.move();
    }
}
interface chessplayer{
    void move();
}

class Queen implements chessplayer{
    public void move(){
        System.out.println("up,down,right,left,digonal");
    }
}

class Rook implements chessplayer{
    public void move(){
        System.out.println("up,down,right,left");
    }
}


class king implements chessplayer{
    public void move(){
        System.out.println("up,down,right,left,digonal(only one setp)");
    }
}