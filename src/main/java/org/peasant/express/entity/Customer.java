/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.peasant.express.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import org.peasant.jpa.DatedEntity;
import org.peasant.jpa.ExtAddress;

/**
 *
 * @author raymond
 */
@Entity
public class Customer extends DatedEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(unique = true)
    protected String wxOpenId;


    @ElementCollection
    protected Set<ExtAddress> fromAddrBook = new HashSet<>();

    @ElementCollection
    protected Set<ExtAddress> toAddrBook = new HashSet<>();

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public Set<ExtAddress> getFromAddrBook() {
        return fromAddrBook;
    }

    public void setFromAddrBook(Set<ExtAddress> fromAddrBook) {
        this.fromAddrBook = fromAddrBook;
    }

    public Set<ExtAddress> getToAddrBook() {
        return toAddrBook;
    }

    public void setToAddrBook(Set<ExtAddress> toAddrBook) {
        this.toAddrBook = toAddrBook;
    }

}
