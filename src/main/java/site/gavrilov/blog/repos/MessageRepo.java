package site.gavrilov.blog.repos;

import org.springframework.data.repository.CrudRepository;
import site.gavrilov.blog.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);
}
