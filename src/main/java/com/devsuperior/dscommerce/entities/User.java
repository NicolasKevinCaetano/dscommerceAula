package com.devsuperior.dscommerce.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   // id com minúscula

    private String nome;   // atributos com minúscula
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String password;

    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<>();

    // Construtor com argumentos (sem id porque é gerado pelo banco)
    public User(String nome, String email, String phone, LocalDate birthDate, String password) {
        this.nome = nome;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.password = password;
    }

    // Construtor padrão (obrigatório para JPA)
    public User() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public LocalDate getBirthDate() {

        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {

        this.birthDate = birthDate;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }
}