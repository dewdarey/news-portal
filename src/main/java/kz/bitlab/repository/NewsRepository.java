package kz.bitlab.repository;

import jakarta.transaction.Transactional;
import kz.bitlab.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface NewsRepository extends JpaRepository<News, Long> {
}
