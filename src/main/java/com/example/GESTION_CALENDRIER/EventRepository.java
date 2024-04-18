package com.example.GESTION_CALENDRIER;
package com.example.repository;

import com.example.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Evenement, Long> {
}
