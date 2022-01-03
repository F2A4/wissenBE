package daw.wissenBE.repository;


import daw.wissenBE.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VideoRepository
        extends JpaRepository<Video, Long> {

    @Query("Select s FROM Video s Where s.name = ?1")
    Optional<Video> findVideoByName(String name);
}
