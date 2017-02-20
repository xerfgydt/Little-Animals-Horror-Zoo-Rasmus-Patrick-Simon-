public class Snake {
    // attributter 
    private String name;
    private int xPosition ; 
    private int yPosition ; 

    public Snake(String name, int xPosition, int yPosition ) {
        this.name = name; 
        this.xPosition = xPosition;
        this.yPosition = yPosition; 
    }
    //operations
    public void setNameSnake(String name) {
        System.out.println("Snake");
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
        System.out.println("Jeg er Snake. Jeg er her: " + xPosition +"," + yPosition);
    }
    //public void setStartpositionsSnake(int xPosiotin && yPosition) {

    //}
    
    //public void PositionSnake() { //opdatere koordinaterne for hvert ryk
       
        //if public void moveUp() { // for snake til at rykke up
        //System.out.println("iam a snake i will move up to x,y")
        //}
            //else if public void moveDown() {
        //System.out.println("iam a snake i will move down to x,y")
        //}
            //else if public void moveLeft() {
        //System.out.println("iam a snake i will move left to x,y")
        //}
            //else public void moveRight() {
        //System.out.println("iam a snake i will move right to x,y")
        //}

    //}
    
    //public void iKiilYou(String) {
        //System.out.println("I Kiiil YOU")
    //}


}