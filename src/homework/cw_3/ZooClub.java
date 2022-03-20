package homework.cw_3;

import lombok.*;
import java.util.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZooClub {
    private Map<Person, List<? extends Pet>> club;
}
