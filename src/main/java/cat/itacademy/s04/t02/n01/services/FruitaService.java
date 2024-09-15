package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.Fruita;
import cat.itacademy.s04.t02.n01.repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitaService {

    @Autowired
    private FruitaRepository fruitaRepository;

    public List<Fruita> getAllFruites() {
        return fruitaRepository.findAll();
    }

    public Optional<Fruita> getOneFruita(int id) {
        return fruitaRepository.findById(id);
    }

    public Fruita addFruita(Fruita fruita) {
        return fruitaRepository.save(fruita);
    }

    public Fruita updateFruita(Fruita fruita) {
        return fruitaRepository.save(fruita);
    }

    public void deleteFruita(int id) {
        fruitaRepository.deleteById(id);
    }
}
