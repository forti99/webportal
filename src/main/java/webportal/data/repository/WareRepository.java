package webportal.data.repository;

import webportal.data.entity.Ware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WareRepository extends JpaRepository<Ware, Long> {

    Ware findByWareId(Long postId);

    @Override
    List<Ware> findAll();

}

