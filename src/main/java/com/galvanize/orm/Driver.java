package com.galvanize.orm;

interface Driver {
    void save(Object obj);

    Object get(int id);
}
