import java.util.Random;

public class Mines{

static Random random=new Random();
private static int zone=100;
private static int rando= random.nextInt(zone);




public static void main(String[] args) {

    
    GameArena game= new GameArena(750,500);

        Character mine1 =new Character(rando, rando);
        rando= random.nextInt(zone*2)+ zone;
        game.pause();
        Character mine2 =new Character(rando, rando);
        rando= random.nextInt(zone*3)+ zone;
        game.pause();
        Character mine3 =new Character(rando, rando);
        rando= random.nextInt(zone*3)+ zone;

        Character mine4 =new Character(rando, rando);
        rando= random.nextInt(zone*3)+ zone;

        Character mine5 =new Character(rando, rando);
        rando= random.nextInt(zone*3)+ zone;

        Character star =new Character(700, 25,"yellow");
        

        Week15V2 dog = new Week15V2(4, 0);

        

    mine1.addTo1(game);
    mine2.addTo1(game);
    mine3.addTo1(game);
    mine4.addTo1(game);
    mine5.addTo1(game);
    star.addTo2(game);
    
    dog.addTochita(game);
    game.pause();
    while (true) {
    mine1.move();
    mine2.move();
    mine3.move();
    mine4.move();
    mine5.move();
    dog.Move(game);
    game.pause();

}
    
    
    



}

}