package developerFactores;

import developers.IDeveloper;
import developers.JavaDeveloper;

public class JavaDeveloperFactory implements IDeveloperFactory{
    @Override
    public IDeveloper createDeveloper() {
        return new JavaDeveloper();
    }
}
