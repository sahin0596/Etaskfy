package az.task.etaskifyms.dto.response.task;
import az.task.etaskifyms.entity.task.TaskStatus;
import az.task.etaskifyms.entity.user.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskForUsersResponseDto {

    Long id;

    String title;

    String description;

    @JsonFormat(pattern = "dd.MM.yyyy")
    LocalDate deadline;

    @Enumerated(EnumType.STRING)
    TaskStatus status;

    @Builder.Default
    List<User> userList=new ArrayList<>();
}

