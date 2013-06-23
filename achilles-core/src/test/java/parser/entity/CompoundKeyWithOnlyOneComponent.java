package parser.entity;

import info.archinnov.achilles.annotations.Order;
import javax.persistence.Column;

@info.archinnov.achilles.annotations.CompoundKey
public class CompoundKeyWithOnlyOneComponent
{

    @Order(1)
    @Column(name = "id")
    private Long userId;

    public CompoundKeyWithOnlyOneComponent() {
    }

    public CompoundKeyWithOnlyOneComponent(Long userId, String name) {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

}
