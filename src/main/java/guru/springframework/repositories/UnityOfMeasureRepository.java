package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnityOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
