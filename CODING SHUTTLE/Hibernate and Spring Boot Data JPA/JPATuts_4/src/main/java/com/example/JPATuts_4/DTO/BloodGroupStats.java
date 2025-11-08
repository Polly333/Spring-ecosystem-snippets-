package com.example.JPATuts_4.DTO;

import com.example.JPATuts_4.Entities.Type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;
}
