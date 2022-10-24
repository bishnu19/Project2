package springBoot.Project2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class OrderExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(OrderException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String orderNotFoundExceptionAdvice(OrderException ex) {
        return ex.getMessage();
    }
}
