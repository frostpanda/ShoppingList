/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist;

//deklaracja klasy Product, implementująca interfejs Clonable 
public class Product implements Cloneable{
    private String categoryName = "Nie podano kategorii"; //deklaracja zmiennej prywatnej typu String przechowującej nazwe kategorii
    private String productName = "Nie podano produktu"; //deklaracja zmiennej prywatnej typu String przechowującej nazwe produktu
    private int productQuantity = 0; //deklaracja zmiennej prywatnej typu Integer, przechowującej ilościu produktu
    
    public Product(){} //deklaracja kontruktora bezparametrowego 
    
    public void setCategoryName(String category){ // deklaracja metody publicznej typu void, ustawiającej nazwę kategorii produktu
        this.categoryName = category;
    }
    
    public String returnNameCategory(){ // deklaracja metody publicznej typu String, zwracającej nazwę kategorii
        return this.categoryName;
    }
    
    public void setProductName(String productName){ // deklaracja metody publicznej typu void, ustawiającej nazwę produktu
        this.productName = productName; 
    }
    
    public String returnProductName(){ // deklaracja metody publicznej typu String, zwracającej nazwę produktu
        return productName;
    }
    
    public void setProductQuantity(int productQuantity){ // deklaracja metody publicznej typu void, ustawiającej ilość produktu
        this.productQuantity = productQuantity;
    }
    
    public float returnProductQuantity(){ // deklaracja metody publicznej typu Integer, zwracającej ilość produktu
        return productQuantity;
    } 
       
    public Object cloning() throws CloneNotSupportedException { //deklaracja metody publiczej typu Object, pozwalającej na klonowanie klasy Product
        return super.clone();
    }
}
