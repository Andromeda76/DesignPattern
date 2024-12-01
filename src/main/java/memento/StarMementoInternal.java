package memento;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StarMementoInternal implements StarMemento{
    private StarType starType;
    private int ageYears;
    private int massTons;
}
