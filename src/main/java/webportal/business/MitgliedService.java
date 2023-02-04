package webportal.business;

import webportal.data.entity.Mitglied;
import webportal.data.repository.MitgliedRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MitgliedService {

    private final MitgliedRepository mitgliedRepository;

    public MitgliedService(MitgliedRepository mitgliedRepository) {
        this.mitgliedRepository = mitgliedRepository;
    }

    public void saveMitglied(Mitglied mitglied) {
        getMitgliedRepository().save(mitglied);
    }

    public List<Mitglied> getAllMitglieder() {
        return getMitgliedRepository().findAll();
    }

    public Mitglied getMitgliedById(Long id) {
        return mitgliedRepository.getById(id);
    }

    public void deleteMitglied(Mitglied mitglied) {
        getMitgliedRepository().delete(mitglied);
    }

    public MitgliedRepository getMitgliedRepository() {
        return mitgliedRepository;
    }
}

