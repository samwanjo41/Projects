package product;


import java.util.Date;
import java.util.List;

public class Product {
    private int id;
    private String prod_name;
    private String prod_description;
    private String prod_avatar_url;
    private float prod_price;
    private Category prod_category;
    private List<Tags> prod_tags;
    private int prod_quantity;
    private Date created_at;
    private boolean inStock;
}
