package product;

import java.util.List;

public interface ServiceMethods {

    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public String deleteProduct(Integer id);



    //Inventory methods
    public void addNewToInventory(Product product);
    public void incrementProductCount(int id, int count);
    public void decrementProductCount(int id, int count);
    public void removeFromInventory(int id);
    public List<Product> getAllProducts();
    public Product getProductByName(String productName);
    public Product getProductById(int id);

    //Category methods
    public Category addCategory(String name);
    public void deleteCategory(String name);
    public List<Category> getCategories();

}
