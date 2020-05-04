package guru.springframework.exceptions;

public class RecipeNotFoundException extends RuntimeException {

    public RecipeNotFoundException() {
        super("Recipe Not Found");
    }
}
