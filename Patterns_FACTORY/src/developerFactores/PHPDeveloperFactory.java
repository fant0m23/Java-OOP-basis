package developerFactores;

import developers.IDeveloper;
import developers.PHPDeveloper;

public class PHPDeveloperFactory implements IDeveloperFactory {
    @Override
    public IDeveloper createDeveloper() {
        return new PHPDeveloper();
    }
}
