public class Rabbit {

    private String name;
    private int xPosition;
    private int yPosition;

    public Rabbit(String name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    
    public void setNameRabbit(String name) {
        System.out.println("Rabbit");
    }
    public void moveUp(){
        this.yPosition = yPosition + 1 ;

    }
    public void moveDown(){
        this.yPosition = yPosition - 1 ;

    }
    public void moveRight(){
        this.xPosition = xPosition + 1 ;

    }
    public void moveLeft(){
        this.xPosition = xPosition - 1 ;

    }
    
    public void tellPosition(){
        System.out.println("Jeg er Rabbit. Jeg rykker hertil: " + xPosition +"," + yPosition);
    }
    
    //public void mercy(String) {
        //System.out.println("ask for mercy")
    //}
}




