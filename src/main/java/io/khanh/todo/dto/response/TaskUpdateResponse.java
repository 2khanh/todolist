package io.khanh.todo.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskUpdateResponse {

    int id;

    String title;

    String description;

    Date updateAt;

}
