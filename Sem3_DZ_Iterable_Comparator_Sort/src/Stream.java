//   — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroupList;
    int counter;

    public Stream() {
        this.studyGroupList = new ArrayList<>();
        this.counter = 0;
    }

    public void addGroup(StudyGroup sG){
        studyGroupList.add(sG);
    }

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new StreamIterator(this);
    }
}
