package Ex3;

import java.util.List;

public class Client {
    private String name;
    private int cc;

    private List<Product> products;

    public Client(String name, int cc) {
        this.name = name;
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", cc=" + cc +
                '}';
    }
}
