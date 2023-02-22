import java.util.Random;
public class Character{
    
    Random random=new Random();
    private int rando= random.nextInt(2);
    private int width=13;
    private int height=13;
    
    
    private Rectangle[] charac=new Rectangle[9];
    private Rectangle[] star=new Rectangle[5];

    
    
    public Character(int x, int y){

        
        charac[0]= new Rectangle(x, y, width, height, "red");
        charac[1]= new Rectangle(x+width*4, y, width, height, "red");
        charac[2]= new Rectangle(x+width, y+height, width, height, "red");
        charac[3]= new Rectangle(x+width*3, y+height, width, height, "red");
        charac[4]= new Rectangle(x+width*2, y+height*2, width, height, "green");
        charac[5]= new Rectangle(x+width, y+height*3, width, height, "red");
        charac[6]= new Rectangle(x+width*3, y+height*3, width, height, "red");
        charac[7]= new Rectangle(x, y+height*4, width, height, "red");
        charac[8]= new Rectangle(x+width*4, y+height*4, width, height, "red");
    }

    public Character(int x, int y, String string){

        star[0]= new Rectangle(x, y, width, height, string);
        star[1]= new Rectangle(x-width, y+height, width, height, string);
        star[2]= new Rectangle(x, y+height, width, height, "blue");
        star[3]= new Rectangle(x+width, y+height, width, height, string);
        star[4]= new Rectangle(x, y+height*2, width, height, string);
    }

    public void addTo1(GameArena gameArena){
        for (int i = 0; i < charac.length; i++) {
            gameArena.addRectangle(charac[i]);
        }
    }
    public void addTo2(GameArena gameArena){
        for (int i = 0; i < star.length; i++) {
            gameArena.addRectangle(star[i]);
        }
    }
    
    public void move(){
        if (rando==0) {
            
                int i = 0;
                for ( i = 0; i < charac.length; i++) {
                    charac[i].setXPosition((int)charac[i].getXPosition() + 1);
                } 
                i=i-1;
                if ((int) charac[i].getXPosition()+ width==750) {
                    while ((int) charac[0].getXPosition()!= 0) {
                        for ( i = 0; i < charac.length; i++) {
                        charac[i].setXPosition((int)charac[i].getXPosition() - 1);
                        }
                    }
                }
                
            
            
        }
        if (rando==1) {
            
                int i = 0;
                for ( i = 0; i < charac.length; i++) {
                    charac[i].setYPosition((int)charac[i].getYPosition() + 1);
                }
                i=i-1;
                if ((int) charac[i].getYPosition()+ width==500) {
                    while ((int) charac[0].getYPosition()!= 0) {
                        for ( i = 0; i < charac.length; i++) {
                        charac[i].setYPosition((int)charac[i].getYPosition() - 1);
                        }
                    }
                }
            
        }
        
    }
}