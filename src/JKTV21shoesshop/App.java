/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JKTV21shoesshop;

import entity.Product;
import static java.util.Arrays.copyOf;
import java.util.Scanner;
import managers.ProductManager;
/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner = new Scanner(System.in);
    private Product[]products;
    private ProductManager productManager();
    
    public App() {
        products = new Product[0];
        ProductManager productManager = new ProductManager();
      
    }
  
    public void run() {
        boolean repeat = true;
        do{
           System.out.println("Выберите задачу: ");
           System.out.println("0 - Выход из программы: ");
           System.out.println("1 - Добавить продукт ");
           System.out.println("2 - Список продаваемых продуктов ");
           System.out.println("3 - Добавить покупателя ");
           System.out.println("4 - Список зарегистрированных покупателей ");
           System.out.println("5 - Покупка покупателем продукта ");
           System.out.println("6 - Оборот магазина за все время работы ");
           System.out.println("7 - Добавить денег покупателю ");
           
           
           int task = scanner.nextInt();
           scanner.nextLine();
           switch(task) {
               case 0:
                   repeat = false;
                   System.out.println("Программа закончена");
                  break;
               
                case 1:
                   System.out.println("Добавили продукт");
                   this.products = copyOf(products,products.length +1);
                   this.products[this.products.length -1] = productManager.createProduct();
                  break;
                case 2:
                   System.out.println("Список продуктов");
                  break;
                case 3:
                   System.out.println("Добавили покупателя");
                  break; 
                case 4:
                   System.out.println("Список зарегистрированных покупателей: ");
                   readerManager.printListReaders(readers);
                  break;  
                case 5:
                   System.out.println("Покупки покупателя: ");
                  break; 
                case 6:
                   System.out.println("Оборот магазина за все время работы: ");
                  break;  
                case 7:
                   System.out.println("Добавили денег покупателю: ");
                  break;   
              
                default:
                   System.out.println("Выберите одно из действий!");
           }

        }while(repeat);
        System.out.println("By!");
    }
}
