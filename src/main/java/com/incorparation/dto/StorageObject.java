package com.incorparation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.incorparation.model.constant.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StorageObject implements Serializable {
    List<StorageDTO> storages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    @Builder
    public static class StorageDTO implements Serializable {
        private Integer id;
        private String name;
        private String domain;
        private String owner;
        private String email;
        private String country;
        private String province;
        private String city;
        private String address;
        private String zip;
        private String currency;
        private Status status;
        private LocalDateTime createdAt;
        private LocalDateTime modifiedAt;
    }
}
