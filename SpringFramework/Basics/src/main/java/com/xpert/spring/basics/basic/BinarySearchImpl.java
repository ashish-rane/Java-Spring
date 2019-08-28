package com.xpert.spring.basics.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Component attribute tells spring to manage creation/lifecycle of instances of this class.
@Component
public class BinarySearchImpl {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    // Autowired tells spring that BinarySearchImpl is dependent on another component of type SortAlgorithm
    // (i.e implements this interface)
    // Since we have not specified a constructor this is setter injection.
    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    // This is a constructor injection. Can be used for mandatory dependencies.
    /*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    public int search(int[] numbers, int searchNum){
        int[] sorted = sortAlgorithm.sort(numbers);

        // do search

        // just some dummy implementation.
        return 3;
    }

    @PostConstruct
    public void postContruct(){
        LOGGER.info("Binary Search Impl : Post Construct");
    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("Binary Search Impl: Pre Destroy");
    }
}
