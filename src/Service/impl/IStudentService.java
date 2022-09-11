package Service.impl;

import Repository.impl.IRepositoryStudent;
import Repository.StudentRepository;
import Service.IServiceStudent;

public class StudentService implements IServiceStudent {
    private StudentRepository repository = new IRepositoryStudent();
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
