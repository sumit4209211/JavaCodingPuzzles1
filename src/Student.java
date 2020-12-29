import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.stream.Collectors;

public class Student {


        Integer id;

        String name;

        Integer age;

        Float score;

        Set<String> books;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Set<String> getBooks() {
        return books;
    }

    public void setBooks(Set<String> books) {
        this.books = books;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Map<String, Float> collect = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getScore));
        System.out.println(collect);


    }
}
