package cat.itacademy.s04.t02.n01.repository;

import cat.itacademy.s04.t02.n01.model.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitaRepository extends JpaRepository<Fruita, Integer> {
}
