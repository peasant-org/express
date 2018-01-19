/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.peasant.express.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.peasant.jpa.DatedEntity;

/**
 *
 * @author raymond
 */
@Entity
public class Brand extends DatedEntity {

    protected String name;

    @ElementCollection
    @ManyToMany(cascade = CascadeType.PERSIST)
    protected Set<ServiceStation> stations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
