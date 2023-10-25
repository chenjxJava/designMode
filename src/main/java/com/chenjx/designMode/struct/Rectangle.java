package com.chenjx.designMode.struct;

import lombok.*;

@Data
@RequiredArgsConstructor(staticName = "of")
public class Rectangle extends Shape {
    // 长
    @NonNull
    private int length;
    // 宽
    @NonNull
    private int width;
}