package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;
    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    void getRecipes() {
        Recipe recipe = new Recipe();
        HashSet<Recipe> recipeData = new HashSet<>();
        recipeData.add(recipe);
        when(recipeRepository.findAll()).thenReturn(recipeData);

        var recipes = this.recipeService.getRecipes();
        assertEquals(1, recipes.size());
        verify(recipeRepository, times(1)).findAll();
    }
}