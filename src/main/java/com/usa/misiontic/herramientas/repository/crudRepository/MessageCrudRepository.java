package com.usa.misiontic.herramientas.repository.crudRepository;

import com.usa.misiontic.herramientas.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
