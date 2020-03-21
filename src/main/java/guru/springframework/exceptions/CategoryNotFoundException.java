package guru.springframework.exceptions;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException() {
        super("Expected Category Not Found");
    }
}
