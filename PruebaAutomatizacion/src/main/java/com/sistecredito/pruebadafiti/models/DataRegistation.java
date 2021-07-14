package com.sistecredito.pruebadafiti.models;

public class DataRegistation {

    private String email;
    private String pass;
    private String documentNumber;
    private String name;
    private String lastName;
    private String birthDate;


    public DataRegistation(String email, String pass,
                           String documentNumber, String name, String lastName, String birthDate) {
        this.email = email;
        this.pass = pass;
        this.documentNumber = documentNumber;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }


    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
