import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudyGroup> {

    private List<StudyGroup> groups;
    private int counter;

    public StreamIterator(Stream stream) {
        this.groups = stream.getStudyGroupList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return groups.size() > counter;
    }

    @Override
    public StudyGroup next() {
        if (hasNext()) return groups.get(counter++);
        return null;
    }
}
