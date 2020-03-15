package ru.halal.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.halal.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
