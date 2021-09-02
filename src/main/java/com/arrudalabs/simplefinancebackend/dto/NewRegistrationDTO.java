package com.arrudalabs.simplefinancebackend.dto;

import javax.persistence.Entity;

import com.arrudalabs.simplefinancebackend.entities.NewRegistration;


public class NewRegistrationDTO {

    //Construtor
    public NewRegistrationDTO() {
    }
    
    
    public NewRegistrationDTO(NewRegistration entity) {
    	this.name = entity.getName();
    	this.email = entity.getEmail();
    	this.confirmationEmail = entity.getConfirmationEmail();
    	this.password = entity.getPassword();
    	this.confirmationPassword = entity.getConfirmationPassword();
    }

    //atributos
    private String name;
    private String email;
    private String password;
    private String confirmationEmail;
    private String confirmationPassword;


    //Getters - Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmationEmail() {
        return confirmationEmail;
    }

    public void setConfirmationEmail(String confirmationEmail) {
        this.confirmationEmail = confirmationEmail;
    }

    public String getConfirmationPassword() {
        return confirmationPassword;
    }

    public void setConfirmationPassword(String confirmationPassword) {
        this.confirmationPassword = confirmationPassword;
    }
}
