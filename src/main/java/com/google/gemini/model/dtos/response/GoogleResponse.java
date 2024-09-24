
package com.google.gemini.model.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoogleResponse {

    private List<Candidate> candidates = new ArrayList<>();
    private UsageMetadata usageMetadata;
}
