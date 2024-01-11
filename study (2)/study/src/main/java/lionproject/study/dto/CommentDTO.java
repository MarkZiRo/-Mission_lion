package lionproject.study.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class CommentDTO {
    private Long id;
    private String commentWrite;
    private String commentContents;
    private Long boardId;
    private LocalDateTime commentCreatedTime;
}
