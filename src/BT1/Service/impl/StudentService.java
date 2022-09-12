package BT1.Service.impl;

import BT1.Repository.IRepositoryStudent;
import BT1.Repository.impl.StudentRepository;
import BT1.Service.IServiceStudent;

public class StudentService implements IServiceStudent {
   private IRepositoryStudent repository = new StudentRepository();
    @Override
    public void addStudent() {
      repository.addStudent();
    }

    @Override
    public void removeStudent(int index) {
     repository.removeStudent(index);
    }

    @Override
    public void showListStudent() {
     repository.showListStudent();
    }
}
