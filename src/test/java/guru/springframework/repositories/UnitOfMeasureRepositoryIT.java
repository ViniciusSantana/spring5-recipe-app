package guru.springframework.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() {
    }

    @Test
    public void findByDescription() {
        var teaspoon = this.unitOfMeasureRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon", teaspoon.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() {
        var teaspoon = this.unitOfMeasureRepository.findByDescription("Cup");
        assertEquals("Cup", teaspoon.get().getDescription());
    }
}