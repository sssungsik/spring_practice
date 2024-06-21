package birthday.message;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    Message findByTitle(String title);
    Message findByTitleAndContent(String title, String content);
    List<Message> findByTitleLike(String title);

}
