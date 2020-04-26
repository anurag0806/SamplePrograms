package org.prog.sample.psv;

import lombok.Getter;

@Getter
public
class Model {
    private final String field1;
    private final String field2;
    private final String field3;
    private final String field4;

    public Model(String[] values) {
        field1 =  values[0].trim();
        field2 =  values[1].trim();
        field3 =  values[2].trim();
        field4 =  values[3].trim();
    }
}
