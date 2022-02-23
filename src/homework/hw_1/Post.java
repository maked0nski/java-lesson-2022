package homework.hw_1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Post {
    private int id;
    private int userId;
    private String title;
    private String body;
}
