package InstructorAndCourses;

import javax.persistence.*;

@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;


    @ManyToOne
    @JoinColumn(name="instructor_id")
    private Instructor instructor;

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor=instructor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
