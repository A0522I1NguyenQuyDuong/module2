package BT1.Service.impl;

import BT1.Service.IServiceTeacher;

public class TeacherService implements IServiceTeacher {
  private IServiceTeacher repository = new TeacherService();
    @Override
    public void addNewTeacher() {
      repository.addNewTeacher();
    }

    @Override
    public void removeTeacher(int index) {
      repository.removeTeacher(index);
    }

    @Override
    public void showListTeacher() {
      repository.showListTeacher();
    }
}
