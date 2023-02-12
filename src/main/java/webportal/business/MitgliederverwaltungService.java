package webportal.business;

import webportal.data.entity.Mitglied;
import webportal.data.repository.MitgliedRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MitgliederverwaltungService {

    private final MitgliedRepository mitgliedRepository;

    public MitgliederverwaltungService(MitgliedRepository mitgliedRepository) {
        this.mitgliedRepository = mitgliedRepository;
    }

    public void saveMitglied(Mitglied mitglied) {
        getMitgliedRepository().save(mitglied);
    }

    public List<Mitglied> getAllMitglieder() {
        return getMitgliedRepository().findAll();
    }

    public Mitglied getMitgliedById(Long id) {
        return mitgliedRepository.findByMitgliedId(id);
    }

    public void deleteMitgliedById(Long id) {
        getMitgliedRepository().deleteById(id);
    }

    public MitgliedRepository getMitgliedRepository() {
        return mitgliedRepository;
    }
}

