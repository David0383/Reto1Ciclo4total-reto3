package com.scrum7.controller;

import com.scrum7.model.Product;
import com.scrum7.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Jeison Hernandez
 */


@RestController
@RequestMapping("/api/cleaningproduct")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,
        RequestMethod.PUT,RequestMethod.DELETE})
public class ProductController {
    @Autowired
    private ProductService servicio;

    @GetMapping("/all")
    public List<Product> listAll() {
        return servicio.getAll();
    }

    @GetMapping("/{reference}")
    public Optional<Product> getProduct(@PathVariable("reference") String reference) {
        return servicio.getProduct(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product product) {
        return servicio.create(product);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Product update(@RequestBody Product product) {
        return servicio.update(product);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return servicio.delete(reference);
    }
}
