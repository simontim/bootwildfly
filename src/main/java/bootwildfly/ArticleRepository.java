package bootwildfly;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "rilegatore", path = "rilegatore")
public interface ArticleRepository extends MongoRepository<Article, String> {

	List<Article> findByTitle(@Param("title") String title);

}
