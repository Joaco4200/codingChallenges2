package Hashing;

public class Product {
	String code;
    String name;
    String city;

    public Product(String codigo, String nombre, String ciudad) {
        this.code = codigo;
        this.name = nombre;
        this.city = ciudad;
    }

   
    public String toString() {
        return "(" + code + ", " + name + ", " + city + ")";
    }
}
