package Repository;

import com.School.students.Entity.StudentsDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentsDAO, Integer> {
}
