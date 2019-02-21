package todo.web.spring; 

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
@RequestMapping("/")
public class WebApplication {

  @RequestMapping(value = "prodcuts", method = RequestMethod.GET)
  public List<ProductQuantity> list(){
    return ProductStub.list();
  }  
  @RequestMapping(value = "product", method = RequestMethod.POST)
  public Product create(@RequestBody Product product){
    return ProductStub.create(Product);
  }  
   @RequestMapping(value = "product/{name}", method = RequestMethod.GET)
  public Product get(@PathVariable name){
    return ProductStub.get(name);
  }
   @RequestMapping(value = "product/{name}", method = RequestMethod.PUT)
  public Product update(@PathVariable name, @RequestBody Product Product){    
    return ProductStub.update(name, Product);

}
  @RequestMapping(value = "product/{name}", method = RequestMethod.DELETE)
  public Product delete(@PathVariable Long id){
    return ProductStub.delete(id);
  }
}