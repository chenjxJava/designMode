package com.chenjx.designMode.struct;

import lombok.*;

@Data
@RequiredArgsConstructor(staticName = "of")
public class Square extends Shape {
    // 边长
    @NonNull
    private int sideLength;
}