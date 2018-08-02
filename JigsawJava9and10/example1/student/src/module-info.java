module student {
    requires java.base;
    requires course;
    requires teacher;
    exports com.laxtech.student.controller;
}