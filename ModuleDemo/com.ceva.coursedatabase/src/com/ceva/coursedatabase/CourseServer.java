package com.ceva.coursedatabase;

import java.util.ArrayList;
import java.util.List;

public class CourseServer {
    public List<Course> getCourseList(){
        List<Course> courseList = new ArrayList<Course>();

        for(int i = 0; i < 10; i++){
            Course course =  new Course();
            course.setCourseName("Course name: " + i);
            course.setCourseAuthor("Author: James " + i);

            courseList.add(course);
        }

        return courseList;
    }
}
