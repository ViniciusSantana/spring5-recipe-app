package guru.springframework;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.Assert.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Spring5RecipeAppApplicationTests {

	@Test
	public void contextLoads() {
		assertTrue(true);
	}

}
