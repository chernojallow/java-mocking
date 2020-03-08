package com.galvanize.orm;

class Orm {
    private Driver driver;

    public Orm(Driver driver) {
        this.driver = driver;
    }

    public void save(Object obj) {
        driver.save(obj);
    }

    public Object get(int id) {
        return driver.get(id);
    }
}




//package com.galvanize.orm;
//class Orm {
//    private Driver driver;
//    public Orm(Driver driver) {
//        this.driver = driver;
//    }
//    public void save(Object obj) {
//        driver.save(obj);
//    }
//    public Object get(int id) throws Exception {
//        if (id == 1) {
//            throw new RuntimeException();
//        }
//        return driver.get(id);
//    }