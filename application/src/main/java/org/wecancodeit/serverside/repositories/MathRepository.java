package org.wecancodeit.serverside.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.serverside.models.Math;

import java.util.Optional;

public interface MathRepository extends CrudRepository<Math, Long> {
    Optional<Math> findByName(String MathName);
//    this will stop duplication
}
