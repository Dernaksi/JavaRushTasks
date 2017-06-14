package com.javarush.task.task36.task3608.controller;

import com.javarush.task.task36.task3608.model.FakeModel;
import com.javarush.task.task36.task3608.model.Model;
import com.javarush.task.task36.task3608.model.ModelData;
import com.javarush.task.task36.task3608.view.UsersView;

/**
 * Created by Пользователь on 14.06.2017.
 */
public class Controller {
    private Model model;
    private UsersView usersView;


    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers(){

        model.loadUsers();
        usersView.refresh(model.getModelData());

    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }
}
