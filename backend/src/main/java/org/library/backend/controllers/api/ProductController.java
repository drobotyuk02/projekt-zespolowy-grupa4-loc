package org.library.backend.controllers.api;

import org.library.backend.dto.ProductDTO;
import org.library.backend.dto.ProductListDTO;
import org.library.backend.models.Product;
import org.library.backend.repositories.ProductRepository;
import org.library.backend.util.constants.ProductType;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ProductController(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

//    @GetMapping
//    public List<ProductDTO> index() {
//        List<Product> products = productRepository.findAll();
//        Type listType = new TypeToken<List<ProductDTO>>() {}.getType();
//
//        return modelMapper.map(products, listType);
//    }

//    @GetMapping
//    public List<ProductListDTO> index() {
//        List<Product> products = productRepository.findAll();
//        Type listType = new TypeToken<List<ProductListDTO>>() {}.getType();
//
//        return modelMapper.map(products, listType);
//    }

    @GetMapping
    public List<ProductListDTO> index(@RequestParam Optional<String> type) {
        if (type.isPresent()) {
            return productRepository.findByType(ProductType.valueOf(String.valueOf(type)), null);
        }

        List<Product> products = productRepository.findAll();
        Type listType = new TypeToken<List<ProductListDTO>>() {}.getType();

        return modelMapper.map(products, listType);
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable int id) {
        return productRepository.findById(id).orElse(null);
    }
}
