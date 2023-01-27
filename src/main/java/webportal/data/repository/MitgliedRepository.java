package webportal.data.repository;

import webportal.data.entity.Mitglied;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MitgliedRepository extends JpaRepository<Mitglied, Long> {

    Mitglied findByMitgliedId(Long postId);

    @Override
    List<Mitglied> findAll();

}

