package modelDecorator;

import models.IComplexNumber;

public abstract class ComplexNumberDecorator implements IComplexNumber {

    protected IComplexNumber startComplexNumber;
    protected IComplexNumber changerComplexNumber;

    public ComplexNumberDecorator(IComplexNumber startComplexNumber, IComplexNumber changerComplexNumber) {
        this.startComplexNumber = startComplexNumber;
        this.changerComplexNumber = changerComplexNumber;
    }
}
