/********************************************************************
 * File Name:    Band.java
 *
 * Date Created: Oct 14, 2019
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2019 IINCORE. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS 
package com.assignments.pojo;


import java.util.concurrent.atomic.AtomicLong;


/**
 *
 * @author Ashish Verma
 * @version 1.0
 *
 */
public class Band {

    private AtomicLong small;
    private AtomicLong medium;
    private AtomicLong large;

    public Band() {
        super();
        small = new AtomicLong(0);
        medium = new AtomicLong(0);
        large = new AtomicLong(0);
    }

    public AtomicLong getSmall() {
        return small;
    }

    public void setSmall(AtomicLong small) {
        this.small = small;
    }

    public AtomicLong getMedium() {
        return medium;
    }

    public void setMedium(AtomicLong medium) {
        this.medium = medium;
    }

    public AtomicLong getLarge() {
        return large;
    }

    public void setLarge(AtomicLong large) {
        this.large = large;
    }

}
