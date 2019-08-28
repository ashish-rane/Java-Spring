package com.xpert.spring.withoutBoot.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm {

    private  static  Logger LOGGER = LoggerFactory.getLogger(QuickSortAlgorithm.class);

    @Override
    public int[] sort(int[] numbers) {
        LOGGER.info(this.toString());
        return numbers;
    }
}
