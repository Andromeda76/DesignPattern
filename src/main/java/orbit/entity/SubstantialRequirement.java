package orbit.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubstantialRequirement {

    private Boolean isHashed;
    private Boolean isBalanced;
    private Boolean isSaturated;
    private Boolean hasBenefit;
    private Boolean hasLocked;
    private Boolean isChained;
    private Boolean isStructured;

}
