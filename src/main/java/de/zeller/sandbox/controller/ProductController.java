package de.zeller.sandbox.controller;

import de.zeller.sandbox.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements IProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Override
    @PostMapping(path = "product")
    public void saveProduct(@RequestBody Product product) {
        LOGGER.info("received id: " + product.getId());
    }
}
