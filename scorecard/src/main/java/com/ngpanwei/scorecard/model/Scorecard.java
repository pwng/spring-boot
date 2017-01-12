package com.ngpanwei.scorecard.model;

import javax.persistence.*;

/**
 * Created by pwng on 10/01/2017.
 */
@Entity
@Table
public class Scorecard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private Long ownerId ;

    private String description ;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getOwnerId() {

        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
