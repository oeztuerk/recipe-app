package guru.springframework.recipeapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UnitOfMeasure
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uom;

    @OneToOne
    private Ingredient ingredients;

    public Ingredient getIngredients()
    {
        return ingredients;
    }

    public void setIngredients(Ingredient ingredients)
    {
        this.ingredients = ingredients;
    }

    public String getUom()
    {
        return uom;
    }

    public void setUom(String uom)
    {
        this.uom = uom;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
}
