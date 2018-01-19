/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.peasant.express.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.peasant.jpa.DatedEntity;
import org.peasant.jpa.ExtAddress;

/**
 *
 * @author raymond
 */
@Entity
public class ServiceStation extends DatedEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 经度
     */
    protected double longitude;

    /**
     * 纬度
     */
    protected double latitude;

    @ManyToMany(cascade = CascadeType.PERSIST)
    protected Set<Brand> brands;

    @Embedded
    protected ExtAddress address;

}
