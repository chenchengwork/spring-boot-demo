package com.chencheng.demo.reflect;

public class ServiceImpl {
    @Autowired
    private PersonDao personDao;

    public int addPerson(Object obj) {
        return personDao.add(obj);
    }
}
