package view.user;

import model.Product;

import java.util.Scanner;

public class ActionProduct {
    public static Product getProductInfomation() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        //String idProduct, String nameProduct, double price, double amount, double informationProduct
        System.out.println(" nhập mã sản phẩm: ");
        String idProduct = sc.nextLine();
        System.out.println(" nhập tên sản phẩm: ");
        String nameProduct = sc.nextLine();
        System.out.println(" nhập giá sản phẩm: ");
        int price = sc.nextInt();
        System.out.println(" nhập số lượng sản phẩm: ");
        int amountProduct = sc.nextInt();
        System.out.println(" nhập thông tin sản phẩm: ");
        String informationProduct = sc1.nextLine();
return new Product(idProduct,nameProduct,price,amountProduct,informationProduct);
    }
    public static String getProductId() {
        System.out.println("Nhập mã sản phẩm: ");
        Scanner scanner=new Scanner(System.in);
        String productId=scanner.nextLine();
        return productId;
    }
}