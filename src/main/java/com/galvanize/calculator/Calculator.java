package com.galvanize.calculator;

class Calculator {
    CloudService service;

    public int perform(int i, int j) throws Exception {

        return service.add(i, j) * i;
    }
}
