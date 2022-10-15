package pl.niepracuj.logsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.niepracuj.logsservice.model.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {

}
