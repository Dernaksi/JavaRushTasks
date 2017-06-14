package com.javarush.task.task36.task3608.model;

/**
 * Created by Пользователь on 14.06.2017.
 */
public class FakeModel implements Model{
    ModelData modelData=getModelData();

    @Override
    public ModelData getModelData() {
        return null;
    }
}
