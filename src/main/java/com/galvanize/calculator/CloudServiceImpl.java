package com.galvanize.calculator;

import java.util.concurrent.TimeUnit;

class CloudServiceImpl implements CloudService {
    @Override
    public int add(int i, int j) throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        return i + j;
    }
}
