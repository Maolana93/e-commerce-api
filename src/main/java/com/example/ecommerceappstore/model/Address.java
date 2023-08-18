package com.example.ecommerceappstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    private LocalUser localUser;

    @Column(name = "address1", nullable = false,length = 1000)
    private String AddressLine1;

    @Column(name = "address2", nullable = false,length = 1000)
    private String AddressLine2;

    @Column(name = "city", nullable = false,length = 50)
    private  String city;

    @Column(name = "country", nullable = false,length = 50)
    private String country;
    
    @Column(name = "post_code", nullable = false,length = 30)
    private String postCode;


}
