package lombok_builder;

import lombok.*;
import org.w3c.dom.ls.LSException;

import java.util.List;
import java.util.Map;

@Builder
@Value
public class Customer {
    private String name;
    @NonNull
    private Integer age;
    @Singular
    private Map<String,Integer> beers;

    @Singular("oneFish")
    private List<String> fish;
}
