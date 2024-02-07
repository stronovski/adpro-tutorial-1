package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product) {
        productData.add(product);
        return product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public Product findById(String id) {
        for (Product product : productData) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public Product update(Product updatedProduct) {
        Product product = findById(updatedProduct.getId());
        product.setProductName(updatedProduct.getProductName());
        product.setProductQuantity(updatedProduct.getProductQuantity());
        return product;
    }

    public Product delete(String productToDelete) {
        Product product = findById(productToDelete);
        productData.remove(product);
        return product;
    }
}