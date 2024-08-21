package ec.redis_demo_project.Model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Recipe")
public class Recipe implements Serializable {
    @Id
    //@Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String instructions;
    private String ingredients;
    private String imageName;
    private String cleanedIngredients;

}
