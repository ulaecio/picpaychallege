package com.ulasoftware.picpay.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_wallet_type")
public class WalletType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
}
