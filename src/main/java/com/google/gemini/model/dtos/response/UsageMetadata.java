
package com.google.gemini.model.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsageMetadata {

    private Long candidatesTokenCount;
    private Long promptTokenCount;
    private Long totalTokenCount;
}
