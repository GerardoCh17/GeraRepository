package service;

import java.util.List;
import model.Students;

public interface IStudentsService {
    public List<Students> getStudents();
    public List<Students> getTop5Students();
}
