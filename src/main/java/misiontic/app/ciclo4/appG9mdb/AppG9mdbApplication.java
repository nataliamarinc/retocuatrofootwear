package misiontic.app.ciclo4.appG9mdb;

import misiontic.app.ciclo4.appG9mdb.repository.crud.FootwearCrud;
import misiontic.app.ciclo4.appG9mdb.repository.crud.OrderCrudRepository;
import misiontic.app.ciclo4.appG9mdb.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppG9mdbApplication implements CommandLineRunner {
	@Autowired
	private FootwearCrud footwearCrud;
	@Autowired
	private UserCrudRepository userCrudRepository;
	@Autowired
	private OrderCrudRepository orderCrudRepository;
	public static void main(String[] args) {
		SpringApplication.run(AppG9mdbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		footwearCrud.deleteAll();
		userCrudRepository.deleteAll();
		orderCrudRepository.deleteAll();
	}


}
