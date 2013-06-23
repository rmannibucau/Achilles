package parser.entity;

import info.archinnov.achilles.annotations.CompoundKey;
import info.archinnov.achilles.annotations.Order;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

@CompoundKey
public class CompoundKeyByConstructorWithDuplicateJsonPropertyNames {

    private Long id;

    private String name;

    @JsonCreator
    public CompoundKeyByConstructorWithDuplicateJsonPropertyNames(@JsonProperty("id") @Order(1) Long id,
            @JsonProperty("id") @Order(2) String name) {
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
