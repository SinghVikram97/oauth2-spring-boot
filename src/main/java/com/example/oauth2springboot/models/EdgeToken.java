/*
 * Copyright 2021 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.example.oauth2springboot.models;

public class EdgeToken {

    private String id;
    private String edge_token_type;
    private String partner_id;
    private String payment_instrument_id;
    private String pay_secret_id;
    private String pay_secret_type;
    private String pay_secret_sub_type;
    private String user_id;

    public EdgeToken() {
    }

    public EdgeToken(String id, String edge_token_type, String partner_id, String payment_instrument_id, String pay_secret_id, String pay_secret_type, String pay_secret_sub_type, String user_id) {
        this.id = id;
        this.edge_token_type = edge_token_type;
        this.partner_id = partner_id;
        this.payment_instrument_id = payment_instrument_id;
        this.pay_secret_id = pay_secret_id;
        this.pay_secret_type = pay_secret_type;
        this.pay_secret_sub_type = pay_secret_sub_type;
        this.user_id = user_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEdge_token_type() {
        return edge_token_type;
    }

    public void setEdge_token_type(String edge_token_type) {
        this.edge_token_type = edge_token_type;
    }

    public String getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(String partner_id) {
        this.partner_id = partner_id;
    }

    public String getPayment_instrument_id() {
        return payment_instrument_id;
    }

    public void setPayment_instrument_id(String payment_instrument_id) {
        this.payment_instrument_id = payment_instrument_id;
    }

    public String getPay_secret_id() {
        return pay_secret_id;
    }

    public void setPay_secret_id(String pay_secret_id) {
        this.pay_secret_id = pay_secret_id;
    }

    public String getPay_secret_type() {
        return pay_secret_type;
    }

    public void setPay_secret_type(String pay_secret_type) {
        this.pay_secret_type = pay_secret_type;
    }

    public String getPay_secret_sub_type() {
        return pay_secret_sub_type;
    }

    public void setPay_secret_sub_type(String pay_secret_sub_type) {
        this.pay_secret_sub_type = pay_secret_sub_type;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
