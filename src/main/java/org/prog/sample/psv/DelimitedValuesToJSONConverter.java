package org.prog.sample.psv;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DelimitedValuesToJSONConverter {


    public static final String PIPE_DELIMITER = "\\|";

    public String convertToJson(List<Model> rows) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(rows);
    }

    public List<Model> parseToModelElements(InputStream inputStream) {
        if (Objects.isNull(inputStream)) throw new IllegalArgumentException("Input stream cannot be null");
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        return reader.lines().map(line -> new Model(line.split(PIPE_DELIMITER))).collect(Collectors.toList());
    }


}
