package Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface IService<T> extends JpaRepository<T,Long> {

}
