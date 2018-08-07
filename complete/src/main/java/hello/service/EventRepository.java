package hello.service;

import hello.domain.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {
    public List<Event> findAll();
    public Event save(Event event);
    public void delete(Event event);
    @Query("select b from Event b " +
            "where b.start between ?1 and ?2 and b.end between ?1 and ?2")
    public List<Event> findByDatesBetween(Date start, Date end);
}
