package br.com.lucasmarcelo.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepostitory extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username); // O spring já entende como implementar essa função por causa do findBy
}
