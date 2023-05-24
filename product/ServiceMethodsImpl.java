package product;

import java.util.List;

public class ServiceMethodsImpl implements ServiceMethods{
    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public String deleteProduct(Integer id) {
        return null;
    }

    @Override
    public void addNewToInventory(Product product) {

    }

    @Override
    public void incrementProductCount(int id, int count) {

    }

    @Override
    public void decrementProductCount(int id, int count) {

    }

    @Override
    public void removeFromInventory(int id) {

    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductByName(String productName) {
        return null;
    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public Category addCategory(String name) {
        return null;
    }

    @Override
    public void deleteCategory(String name) {

    }

    @Override
    public List<Category> getCategories() {
        return null;
    }
}
