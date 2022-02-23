package homework.hw_1;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Comment {
    private int id;
    private int postId;
    private String name;
    private String email;
    private String body;
}
