package com.gen.prepractice.comon.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;


@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) // Auditing 기능 활성화
public class BaseEntity {

    @CreatedDate // 생성 시간 자동 저장
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate // 수정 시간 자동 저장
    private LocalDateTime lastModifiedDate;

}
