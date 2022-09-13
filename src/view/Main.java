package view;

import controller.ManagerProduct;
import model.Product;
import storage.ReadData;
import storage.WriteData;
import view.user.ActionProduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerProduct products = new ManagerProduct("Product.csv");
        int choice = -1;
        do {
            System.out.println("-----Chương trình quản lý sản phẩm-----");
            System.out.println("1. Xem danh sách\n" +
                    "2. thêm mới \n" +
                    "3. Cập nhật \n" +
                    "4. Xóa \n" +
                    "5. Sắp xếp \n" +
                    "6. Tìm sản phẩm có giá đắt nhất \n" +
                    "7. Dọc từ File \n" +
                    "8. Ghi vào File" +
                    "0 .Thoát\n" +
                    "----------------------");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    products.displayProduct();
                    break;
                case 2:
                    Product product = ActionProduct.getProductInfomation();
                    products.addNewProduct(product);
                    break;
                case 3:
                    products.displayProduct();
                    break;
                case 4:
                    String idProduct = ActionProduct.getProductId();
                    products.deleteProduct(idProduct);
                    break;
                case 5 :
                    int choice1;
                    System.out.println("1. Sap xep tang dan");
                    System.out.println("2. Sap xep giam dan");
                    choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1 : products.sortProductsByPriceAscending();
                        case 2 : products.sortProductByPriceDescending();
                }
                break;
                case 6 : products.searchMaxPrice();
                break;
                case 7 : ReadData.readFileProductList();
               break;
                case 8 : WriteData.writeFileProduct("FileProduct.csv");
               break;
                case 9 : System.exit(0);
                break;
            }
        }while (choice!=0);
    }
}