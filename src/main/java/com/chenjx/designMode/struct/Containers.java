package com.chenjx.designMode.struct;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import java.util.List;

// 图形容器
@Data
@RequiredArgsConstructor(staticName = "of")
public class Containers {
    @NonNull
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
    private List<Shape> shapes;
}