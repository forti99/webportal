package webportal.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webportal.data.entity.Mitglied;

import java.util.List;

@Repository
public interface MitgliedRepository extends JpaRepository<Mitglied, Long> {

    Mitglied findByMitgliedId(Long Id);

    @Override
    List<Mitglied> findAll();

}

