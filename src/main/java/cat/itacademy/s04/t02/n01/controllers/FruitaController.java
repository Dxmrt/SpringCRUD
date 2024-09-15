package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruita;
import cat.itacademy.s04.t02.n01.services.FruitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fruita")
public class FruitaController {

    @Autowired
    private FruitaService fruitaService;

    @GetMapping("/getAll")
    public List<Fruita> getAllFruites() {
        return fruitaService.getAllFruites();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruita> getOneFruita(@PathVariable int id) {
        Optional<Fruita> fruita = fruitaService.getOneFruita(id);
        if (fruita.isPresent()) {
            return ResponseEntity.ok(fruita.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/add")
    public Fruita addFruita(@RequestBody Fruita fruita) {
        return fruitaService.addFruita(fruita);
    }

    @PutMapping("/update")
    public ResponseEntity<Fruita> updateFruita(@RequestBody Fruita fruita) {
        Optional<Fruita> existingFruita = fruitaService.getOneFruita(fruita.getId());
        if (existingFruita.isPresent()) {
            Fruita updatedFruita = fruitaService.updateFruita(fruita);
            return ResponseEntity.ok(updatedFruita);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruita(@PathVariable int id) {
        Optional<Fruita> fruita = fruitaService.getOneFruita(id);
        if (fruita.isPresent()) {
            fruitaService.deleteFruita(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
