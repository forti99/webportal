package webportal.business;

import webportal.data.entity.Ware;
import webportal.data.repository.WareRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WareService {

    private final WareRepository wareRepository;

    public WareService(WareRepository wareRepository) {
        this.wareRepository = wareRepository;
    }

    public void saveWare(Ware ware) {
        getWareRepository().save(ware);
    }

    public List<Ware> getAllWare() {
        return getWareRepository().findAll();
    }

    public void deleteWare(Ware ware) {
        getWareRepository().delete(ware);
    }

    public WareRepository getWareRepository() {
        return wareRepository;
    }
}

