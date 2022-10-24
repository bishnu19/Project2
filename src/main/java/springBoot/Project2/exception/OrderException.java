package springBoot.Project2.exception;

public class OrderException extends RuntimeException{
    public OrderException(int id) {
        super("Order with the id" + id + " doesnot exits.");
    }
}
