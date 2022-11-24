package com.laptop.vaio.Service;

import com.laptop.vaio.DTO.VaioDTO;
import com.laptop.vaio.Entity.Vaio;
import com.laptop.vaio.Repository.VaioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VaioService {
    @Autowired
    private VaioRepository vaioRepository;

    public String save(List<Vaio> vaio) {
        List<Vaio> obj = new ArrayList<Vaio>();
        Vaio vaio1;
        for (Vaio i : vaio) {
            vaio1 = new Vaio();
            vaio1.setPrice(i.getPrice());
            vaio1.setQuality(i.getQuality());
            vaio1.setLapName(i.getLapName());
            vaio1.setQuantity(i.getQuantity());
            vaio1.setId(i.getId());

            vaioRepository.saveAndFlush(vaio1);
        }
        return "success";

    }

    public String update(List<Vaio> vaio) {
        List<Vaio> obj = new ArrayList<Vaio>();
        Vaio vaio1;
        for (Vaio i : vaio) {
            vaio1 = new Vaio();
            vaioRepository.saveAndFlush(vaio1);
        }
        return " created successfully";
    }

    public List<Vaio> getAll() {

        return vaioRepository.findAll();
    }

    public Optional<Vaio> getById(Integer id) {

        return vaioRepository.findById(id);
    }

    public String  deleteById(Integer id) {
        vaioRepository.deleteById(id);
        return "deleted successfully";
    }
}





