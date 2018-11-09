package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.model.Tweet;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    List<Tweet> findAllByUserId(Long id);

    @Query("select a from Tweet a where a.title like ?1% order by a.created ")
    List<Tweet> findAllByTitleLikePrefix(String prefix);

}
