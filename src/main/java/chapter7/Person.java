package chapter7;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Person {

    private String name;
    private Telephone telephone;

    public String getTele() {
        return telephone.getTel();
    }

    public String getTeleArea() {
        return telephone.getTelArea();
    }
}
