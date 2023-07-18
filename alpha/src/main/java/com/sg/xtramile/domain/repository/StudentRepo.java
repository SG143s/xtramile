package com.sg.xtramile.domain.repository;

import com.sg.xtramile.domain.model.*;
import java.util.List;

public interface StudentRepo {
    List<StudentShow> showall();
    void add(StudentData data);
    void edit(String id, StudentData data);
    void delete(String id);
}
