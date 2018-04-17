package com.webfulx.article.demo.repostiory;


import com.webfulx.article.demo.domain.article;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.Optional;

@Repository
@Table(name = "article")
@Qualifier("articleRepository")
public interface articleRepository extends CrudRepository<article,Integer> {
    article findByAuthorId(Integer id);
}
