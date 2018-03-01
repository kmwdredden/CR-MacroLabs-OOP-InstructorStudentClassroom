package io.zipcoder.interfaces;

public final class ZipCodeWilmington extends People {




    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington(){

    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){

        Student[] s = students.getStudentArray();
        teacher.lecture(s, numberOfHours);

    }

    public void hostLecture(long id, double numberOfHours){
        Instructor currentInstructor = (Instructor) instructors.findById(id);
        hostLecture(currentInstructor, numberOfHours);

    }
}
