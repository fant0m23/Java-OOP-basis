//   — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
//   — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
//   — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
//   — В Main протестировать

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup studyGroup1 = new StudyGroup(83, "РК");
        StudyGroup studyGroup2 = new StudyGroup(98, "ЭУ");
        StudyGroup studyGroup3 = new StudyGroup(81, "РТ");
        StudyGroup studyGroup4 = new StudyGroup(82, "РТ");
        StudyGroup studyGroup5 = new StudyGroup(97, "МТИ");
        StudyGroup studyGroup6 = new StudyGroup(96, "ЭМ");
        StudyGroup studyGroup7 = new StudyGroup(99, "ССК");


        Stream stream1 = new Stream();
        Stream stream2 = new Stream();
        Stream stream3 = new Stream();
        stream2.addGroup(studyGroup1);
        stream3.addGroup(studyGroup2);
        stream2.addGroup(studyGroup3);
        stream2.addGroup(studyGroup4);
        stream3.addGroup(studyGroup5);
        stream3.addGroup(studyGroup6);
        stream3.addGroup(studyGroup7);

        System.out.println("\tПроверка работы StreamIterator:");
        for (StudyGroup sG : stream2) {
            System.out.println(sG);
        }

        StreamService course = new StreamService();
        course.addStream(stream1);
        course.addStream(stream2);
        course.addStream(stream3);

        System.out.println("\tПроверка работы StreamComparator " +
                "\n\t(сортировка - сначала потоки с большим количеством учебных групп):");
        List<List<StudyGroup>> sortedListOfStudyGroups = course.getSortedCourse();
        for (List<StudyGroup> s : sortedListOfStudyGroups) {
            System.out.println(s);
        }
    }
}