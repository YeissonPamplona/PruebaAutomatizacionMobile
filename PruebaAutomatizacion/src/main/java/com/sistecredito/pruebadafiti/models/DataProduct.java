package com.sistecredito.pruebadafiti.models;

public class DataProduct {

    private String product;
    private String size;

    public DataProduct(String product, String size) {
        this.product = product;
        this.size = size;
    }

    public String getProduct() {
        return product;
    }

    public String getSize() {
        return size;
    }
}
