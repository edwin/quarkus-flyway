package com.edw.example.service;

import com.edw.example.entity.Student;
import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * <pre>
 *     com.edw.example.service.StudentService
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 02 Okt 2023 09:20
 */
@ApplicationScoped
public class StudentService {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public List<Student> getAll() {
        logger.debug(String.format("getting all table result"));
        return Student.findAll(Sort.by("id", Sort.Direction.Descending))
                .page(Page.ofSize(5))
                .list();
    }
}
