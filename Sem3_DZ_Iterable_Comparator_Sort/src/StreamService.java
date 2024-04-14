//   — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков,
//   используя созданный StreamComparator;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    List<List<StudyGroup>> course;

    public StreamService() {
        this.course = new ArrayList<>();
    }

    public List<List<StudyGroup>> getCourse() {
        return course;
    }

    public void addStream(Stream stream){
        course.add(stream.getStudyGroupList());
    }

    public List<List<StudyGroup>> getSortedCourse(){
        List<List<StudyGroup>> courseNew = new ArrayList<>(this.course);
        courseNew.sort(new StreamComparator());
        return courseNew;
    }
}
