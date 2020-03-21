package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnityOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    public Optional<UnitOfMeasure> findByDescription(String description);
}
