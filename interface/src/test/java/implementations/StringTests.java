package implementations;

import interfaces.ComparableContract;
import interfaces.EqualsContract;

public class StringTests implements EqualsContract<String> {

    @Override
    public String createValue() {
        return "foo";
    }

    @Override
    public String createNotEqualValue() {
        return "baz";
    }

}
