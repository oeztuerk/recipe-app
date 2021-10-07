package guru.springframework.recipeapp.repositories;

import guru.springframework.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long>
{
    Optional<Category> findByCategoryName(String categoryName);
}
