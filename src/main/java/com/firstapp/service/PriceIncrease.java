package com.firstapp.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.Max;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PriceIncrease {

    protected final Log logger = LogFactory.getLog(getClass());

    @Max(50)
    @Min(0)
    private int percentage;

    public void setPercentage(int i){
        percentage = i;
        logger.info("Percentage ser to " + i);
    }

    public int getPercentage(){
        return percentage;
    }
}
