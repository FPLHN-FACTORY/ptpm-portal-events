package com.portalevent.infrastructure.repository;

import com.portalevent.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SonPT
 */

@Repository(TodoRepository.NAME)
public interface TodoRepository extends JpaRepository<Todo, String> {

    public static final String NAME = "BaseTodoRepository";

}
