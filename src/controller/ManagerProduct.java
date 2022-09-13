package controller;

import model.Product;
import storage.ReadData;
import storage.WriteData;

import java.util.Comparator;
import java.util.List;

public class ManagerProduct {
    private String name;

    public ManagerProduct() {
    }

    public ManagerProduct(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static List<Product> productList = ReadData.readFileProductList();
    public void addNewProduct( Product product){
        productList.add(product);
        WriteData.writeFileProduct(productList.toString());

    }
    public void setProduct(int index,Product product){
        productList.set(index,product);
        WriteData.writeFileProduct(productList.toString());
    }
    public void deleteProduct(String index){
        productList.remove(index);
        WriteData.writeFileProduct(productList.toString());
    }
    public void displayProduct(){
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }
    public void sortProductsByPriceAscending() {
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) ((int) (o1.getPrice()) - o2.getPrice());
            }
        };
        productList.sort(comparator);
        System.out.println("Danh sach san pham da duoc xep theo gia tang dan: ");
        displayProduct();
    }

    public void sortProductByPriceDescending() {
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) ((int) (o2.getPrice()) - o1.getPrice());
            }
        };
        productList.sort(comparator);
        System.out.println("Danh sach san pham da duoc xep theo gia giam dan: ");
        displayProduct();
    }

    public void searchMaxPrice() {
        double max = 0;
        int product = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (max < productList.get(i).getPrice()) {
                max = productList.get(i).getPrice();
                product = i;
            }
        }
        System.out.println("San pham co gia cao nhat trong he thong la: ");
        System.out.println(productList.get(product));
    }

}
