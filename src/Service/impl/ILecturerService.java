package Service.impl;

import Repository.impl.IRepositoryLecturer;
import Repository.LecturerRepository;
import Service.IServiceLecturer;

public class LecturerService implements IServiceLecturer {
    private LecturerRepository repository = new IRepositoryLecturer();

    @Override
    public void addLecturer() {
        repository.addLecturer();
    }

    @Override
    public void removeLecturer(int index) {
     repository.removeLecturer(index);
    }

    @Override
    public void showListLecturer() {
      repository.showListLecturer();
    }
}
