package toto.web.spring;

import java.util.List;

import java.util.Map.Entry;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**

 * Sample web application.<br/>

 * Run {@link #main(String[])} to launch.

 */

@SpringBootApplication
@RestController

public class SpringWebApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringWebApplication.class);
	private final BiMap<Integer, Product> database = HashBiMap.create();
	private final AtomicInteger sequenceGenerator = new AtomicInteger();
	
	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class);
	}
	
	@RequestMapping("/create_item")
	int createUser(@RequestParam("name") String name, @RequestParam("item") String item, @RequestParam("unit") int ProductUnit, @RequestParam("quantity") double quantity) {
		Product c = new Product(name, item, ProductUnit, quantity); 
	
		final int id;

		if (!database.containsValue(c)) {

			id = sequenceGenerator.incrementAndGet();
			c.setId(id);
			database.put(id, c);
			LOGGER.info(c + " created with ID: " + database.inverse()
					.get(c));
		} else {
			id = database.inverse()
					.get(c);
			LOGGER.info(c + " already exists with ID: " + database.inverse()
					.get(c));
		}
		return id;
}

	@RequestMapping("/list_products")
	List<Product> listUsers() {
		return database.entrySet()
				.stream()
				.map(Entry::getValue)
				.collect(Collectors.toList());
	}
}