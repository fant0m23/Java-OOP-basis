//   — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;

import java.util.Comparator;
import java.util.List;

public class StreamComparator implements Comparator<List<StudyGroup>> {
    @Override
    public int compare(List<StudyGroup> o1, List<StudyGroup> o2) {
        if (o1.size() < o2.size()) {
            return 1;
        } else if (o1.size() == o2.size()) { return 0;
        } else return -1;
    }
}
