package com.ngpanwei.scorecard.model;

import javax.persistence.*;

/**
 * Created by pwng on 10/01/2017.
 */
@Entity
@Table
public class ScorecardGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @Column
    private String name ;

    public ScorecardGroup() {
    }
    public ScorecardGroup(String name) {
        this.name = name ;
    }
    @Override
    public String toString() {
        return String.format(
                "ScorecardGroup[id=%d, name='%s']",
                id, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
