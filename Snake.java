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


     //hvis man vi have en metode der retunere en værdi, "kan svare"

    //public "type" getfirstname(){
        //return this.x... ; (return afslutter metode, kan ikke placere noget nedenunder)
    //}

    //eks
    // public String firstname = person1.getfirstname();
    // System.out.println(firstname);

    //"ovre i run class"



    //operations
    public void setNameSnake(String name) {
        System.out.println("Snake");
    }

    public int moveUp(){
        this.yPosition = yPosition + 1 ;
        return this.yPosition;
        

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
        System.out.println("Jeg er Snake. Jeg rykker hertil: " + xPosition +"," + yPosition);
         
    }


    
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