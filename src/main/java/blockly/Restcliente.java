package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;


/** 
* 
* RestController @generated 
* 
*/ 

@RestController
@RequestMapping(value = "/api/rest/main/Bloco")
@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class Restcliente {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */

@RequestMapping(method = RequestMethod.GET, value="/obter")
// restcliente
public static Var obter() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.database.Operations.query(Var.valueOf("app.entity.Cliente"),Var.valueOf("select c from Cliente c"));
   }
 }.call();
}

/**
 *
 * @param id3
 * @return Var
 */

@RequestMapping(method = RequestMethod.GET, value="/deletar/{id3}")
// Descreva esta função...
public static Var deletar(@PathVariable("id3") Var id3 ) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(Var.valueOf(Var.valueOf("\"").toString() + id3.toString() + Var.valueOf("\"").toString()).getObjectAsString());
    System.out.println(Var.valueOf("abc3").getObjectAsString());
    cronapi.database.Operations.execute(Var.valueOf("app.entity.Cliente"), Var.valueOf("delete from Cliente where id = :id"),Var.valueOf("id",cronapi.object.Operations.getObjectField(id3, Var.valueOf("id"))));
    return id3;
   }
 }.call();
}

/**
 *
 * @param Nome2
 * @return Var
 */

@RequestMapping(method = RequestMethod.GET, value="/inserir/{Nome2}")
// Descreva esta função...
public static Var inserir(@PathVariable("Nome2") Var Nome2 ) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(Nome2.getObjectAsString());
    System.out.println(Var.valueOf("inserir").getObjectAsString());
    cronapi.database.Operations.insert(Var.valueOf("app.entity.Cliente"),Var.valueOf("idade",cronapi.object.Operations.getObjectField(Nome2, Var.valueOf("idade"))),Var.valueOf("nome",cronapi.object.Operations.getObjectField(Nome2, Var.valueOf("Nome"))));
    return Nome2;
   }
 }.call();
}

/**
 *
 * @param obj
 * @return Var
 */

@RequestMapping(method = RequestMethod.GET, value="/update/{obj}")
// Descreva esta função...
public static Var update(@PathVariable("obj") Var obj ) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(obj.getObjectAsString());
    System.out.println(Var.valueOf("atualizarrr").getObjectAsString());
    cronapi.database.Operations.execute(Var.valueOf("app.entity.Cliente"), Var.valueOf("update Cliente set nome = :nome, idade = :idade where id = :id"),Var.valueOf("nome",cronapi.object.Operations.getObjectField(obj, Var.valueOf("Nome"))),Var.valueOf("idade",cronapi.object.Operations.getObjectField(obj, Var.valueOf("idade"))),Var.valueOf("id",cronapi.object.Operations.getObjectField(obj, Var.valueOf("id"))));
    return obj;
   }
 }.call();
}

}

