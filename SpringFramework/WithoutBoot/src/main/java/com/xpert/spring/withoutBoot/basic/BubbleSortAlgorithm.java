package com.xpert.spring.withoutBoot.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary // This tells spring framework to use this implementation of SortAlgorithm if multiple implementations are found.
@Qualifier("bubble") // Attaches a qualifier to this class.The same qualifier needs to be put on the reference in BinarySearchImpl
public class BubbleSortAlgorithm implements SortAlgorithm {

    private static Logger LOGGER = LoggerFactory.getLogger(BubbleSortAlgorithm.class);

    @Override
    public int[] sort(int[] numbers) {

        LOGGER.info(this.toString());
        return numbers;
    }
}
