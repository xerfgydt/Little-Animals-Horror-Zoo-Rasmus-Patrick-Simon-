public class RunPlayfield {
    public static void main(String[] args) {
    
    Snake snake = new Snake ("Snake", 10, 10);
    Rabbit rabbit = new Rabbit ("Rabbit", 0, 0);

    snake.tellPosition();
    snake.moveLeft();
    snake.tellPosition();
    
    rabbit.tellPosition();
    rabbit.moveRight();
    rabbit.tellPosition();
    


    
    }

    
}