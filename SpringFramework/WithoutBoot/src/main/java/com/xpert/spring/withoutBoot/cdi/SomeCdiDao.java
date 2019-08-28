package com.xpert.spring.withoutBoot.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {

    public  int[] getData(){
        return new int[] {1,3,4};
    }
}
