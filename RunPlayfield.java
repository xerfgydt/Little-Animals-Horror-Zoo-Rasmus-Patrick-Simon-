public class RunPlayfield {
    public static void main(String[] args) {
    
    Snake snake = new Snake ("Snake", 6, 6);
    Rabbit rabbit = new Rabbit ("Rabbit", 3, 3);


    //System.out.println(snake.moveUp());


    snake.tellPosition();
    snake.moveLeft();
    snake.tellPosition();
    
    rabbit.tellPosition();
    rabbit.moveRight();
    rabbit.tellPosition();
    
    snake.moveDown();
    snake.tellPosition();

    rabbit.moveUp();
    rabbit.tellPosition();

    snake.moveLeft();
    snake.tellPosition();

    rabbit.moveRight();
    rabbit.tellPosition();

    snake.moveDown();
    snake.tellPosition();

    rabbit.moveLeft();
    rabbit.tellPosition();


    
    }


}