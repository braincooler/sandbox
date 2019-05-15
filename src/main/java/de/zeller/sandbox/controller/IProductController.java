package de.zeller.sandbox.controller;

import de.zeller.sandbox.model.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "products",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public interface IProductController {
    void saveProduct(Product product);
}
