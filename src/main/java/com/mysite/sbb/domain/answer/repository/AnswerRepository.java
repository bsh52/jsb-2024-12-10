package com.mysite.sbb.domain.answer.repository;

import com.mysite.sbb.domain.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Question, Integer> {
}
