package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Пользователь on 14.06.2017.
 */
public class FakeModel implements Model{

    private ModelData modelData=new ModelData();


    public ModelData getModelData() {
        return modelData;
    }

    public void loadUsers() {

        User user1 = new User("A",1,1);
        User user2 = new User("B",2,1);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        modelData.setUsers(list);

    }
}
