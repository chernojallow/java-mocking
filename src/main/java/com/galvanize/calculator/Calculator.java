



package com.galvanize.calculator;
class Calculator {
    // Private service to allow it to be mocked and changed
    private CloudService service;
    // Constructor to define service variable
    public Calculator(CloudService service) {
        this.service = service;
    }
    // perform function
    public int perform(int i, int j) throws Exception {
        return service.add(i, j) * i;
    }
}