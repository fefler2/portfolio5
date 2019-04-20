package hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface BooksRepository extends CrudRepository<Books, Long> {



    @Query(value = "SELECT * FROM comments", nativeQuery = true)
    List findAllActiveUsersNative();
}
