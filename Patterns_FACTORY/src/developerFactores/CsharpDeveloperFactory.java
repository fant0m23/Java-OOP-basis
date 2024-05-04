package developerFactores;

import developers.CsharpDeveloper;
import developers.IDeveloper;

public class CsharpDeveloperFactory implements IDeveloperFactory{
    @Override
    public IDeveloper createDeveloper() {
        return new CsharpDeveloper();
    }
}
