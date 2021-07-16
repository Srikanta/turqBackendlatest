package io.turq.turq.model.legislation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LegislationRequest {
    private String title;
    private String ref;
    private long contestId;
}
