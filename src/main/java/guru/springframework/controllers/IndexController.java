package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnityOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private final CategoryRepository categoryRepository;
    private final UnityOfMeasureRepository unityOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnityOfMeasureRepository unityOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unityOfMeasureRepository = unityOfMeasureRepository;
    }


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> optionalCategory = this.categoryRepository.findByDescription("American");
        var teaspoon = this.unityOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat id is : " + optionalCategory.get().getId());
        System.out.println("UOM id is : " + teaspoon.get().getId());
        return "index";
    }
}
