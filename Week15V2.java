import java.lang.reflect.Array;

public class Week15V2 {
    public static void main(String[] args) {
        GameArena mine=new GameArena(2000,2000 );

    

Rectangle chita[]={
        new Rectangle(4,0, 18,2,"GREY",1),
        new Rectangle(4,0, 2, 2,"DARKGREY",2),
        new Rectangle(16,0, 6, 2,"DARKGREY",2), //line 1
        new Rectangle(2,2, 24, 2,"GREY",1),
        new Rectangle(2,2, 4, 2,"DARKGREY",2),
        new Rectangle(22,2, 4, 2,"DARKGREY",2),
        new Rectangle(34,2, 20, 2,"DARKGREY",1), //line 2
        new Rectangle(0,4, 26, 2,"GREY",1),
        new Rectangle(0,4, 2, 2,"BLACK",1),
        new Rectangle(26,4, 8, 2,"ORANGE",1),
        new Rectangle(34,4, 22, 2,"DARKGREY",1),
        new Rectangle(0,6, 2, 2,"DARKGREY",1),
        new Rectangle(2,6, 18, 2,"GREY",1),
        new Rectangle(20,6, 16, 2,"ORANGE",1),
        new Rectangle(36,6, 4, 2,"DARKGREY",1),
        new Rectangle(0,8, 2, 2,"DARKGREY",1),
        new Rectangle(2,8, 16, 2,"GREY",1),
        new Rectangle(18,8, 22, 2,"ORANGE",1),
        new Rectangle(48,8, 8, 2,"DARKGREY",1),
        new Rectangle(2,10, 2, 2,"DARKGREY",1),
        new Rectangle(4,10, 14, 2,"GREY",1),
        new Rectangle(18,10, 16, 2,"ORANGE",1),
        new Rectangle(34,10, 4, 2,"ORANGE",3),
        new Rectangle(28,10, 6, 2,"BLACK",1),
        new Rectangle(32,10, 2, 2,"WHITE",2),
        new Rectangle(34,10, 10, 2,"ORANGE",1),
        new Rectangle(44,10, 6, 2,"DARKGREY",1),
        new Rectangle(50,8, 4, 2,"DARKGREY",2),
        new Rectangle(2,12, 2, 2,"DARKGREY",1),
        new Rectangle(4,12, 14, 2,"GREY",1),
        new Rectangle(18,12, 8, 2,"ORANGE",1),
        new Rectangle(26,12, 10, 2,"BLACK",1),
        new Rectangle(34,12, 2, 2,"WHITE",1),
        new Rectangle(36,12, 10, 2,"ORANGE",1),
        new Rectangle(8,14, 2, 2,"DARKGREY",1),
        new Rectangle(10,14, 8, 2,"GREY",1),
        new Rectangle(18,14, 8, 2,"ORANGE",1),
        new Rectangle(26,14, 10, 2,"BLACK",1),
        new Rectangle(34,14, 2, 2,"WHITE",1),
        new Rectangle(36,14, 12, 2,"ORANGE",1),
        new Rectangle(10,16, 6, 2,"DARKGREY",1),
        new Rectangle(16,16, 10, 2,"ORANGE",1),
        new Rectangle(26,16, 10, 2,"BLACK",1),
        new Rectangle(34,16, 2, 2,"WHITE",1),
        new Rectangle(36,16, 14, 2,"ORANGE",1),
        new Rectangle(14,18, 12, 2,"ORANGE",1),
        new Rectangle(26,18, 2, 2,"WHITE",1),
        new Rectangle(28,18, 6, 2,"BLACK",1),
        new Rectangle(32,18, 2, 2,"WHITE",1),
        new Rectangle(34,18, 18, 2,"ORANGE",1),
        new Rectangle(62,18, 2, 2,"DARKGREY",1),
        new Rectangle(70,18, 2, 2,"DARKGREY",1),
        new Rectangle(64,16, 6, 2,"DARKGREY",1),
        new Rectangle(14,20, 14, 2,"ORANGE",1),
        new Rectangle(28,20, 6, 2,"WHITE",1),
        new Rectangle(34,20, 22, 2,"ORANGE",1),
        new Rectangle(64,20, 2, 2,"DARKGREY",1),
        new Rectangle(68,20, 2, 2,"DARKGREY",1),
        new Rectangle(16,22, 42, 2,"ORANGE",1),
        new Rectangle(58,22, 6, 2,"DARKGREY",1),
        new Rectangle(66,22, 2, 2,"DARKGREY",1),
        new Rectangle(16,24, 4, 2,"MAGENTA",1),
        new Rectangle(20,24, 38, 2,"ORANGE",1),
        new Rectangle(56,24, 4, 2,"DARKGREY",1),
        new Rectangle(62,24, 2, 2,"DARKGREY",1),
        new Rectangle(66,24, 2, 2,"DARKGREY",1),
        new Rectangle(16,26, 4, 2,"MAGENTA",1),
        new Rectangle(20,26,38,2,"ORANGE",1),
        new Rectangle(62,26,6,2,"DARKGREY",1),
        new Rectangle(16,28,4,4,"MAGENTA",1),
        new Rectangle(22,28, 36, 2,"ORANGE",1),
        new Rectangle(24,30, 34, 2,"ORANGE",1),
        new Rectangle(26,32, 32, 2,"ORANGE",1),
        new Rectangle(24,34, 34, 2,"ORANGE",1),
        new Rectangle(22,36, 34, 2,"ORANGE",1),
        new Rectangle(22,38, 32, 2,"ORANGE",1),
        new Rectangle(24,40, 12, 2,"#a87f32",1),
        new Rectangle(40,40, 10, 2,"#a87f32",1)};
    
    }
        
        
        public void Move(GameArena mine){
        if (mine.leftPressed()){
            for (int i = 0; i < chita.length; i++) {
                chita[i].setXPosition(chita[i].getXPosition()-10);
            }
        }
        if (mine.rightPressed()){
            for (int i = 0; i < chita.length; i++) {
                chita[i].setXPosition(chita[i].getXPosition()+10);
            }
        }
        if (mine.upPressed()){
            for (int i = 0; i < chita.length; i++) {
                chita[i].setYPosition(chita[i].getYPosition()-10);
            }
        }
        if (mine.downPressed()){
            for (int i = 0; i < chita.length; i++) {
                chita[i].setYPosition(chita[i].getXPosition()+10);
            }
        }
    
        }}
