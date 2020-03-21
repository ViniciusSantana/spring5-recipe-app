package guru.springframework.exceptions;

public class UnitOfMeasureNotFoundException extends RuntimeException {

    public UnitOfMeasureNotFoundException() {
        super("Expected UOM Not Found");
    }
}
