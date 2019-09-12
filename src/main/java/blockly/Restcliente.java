package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Restcliente {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// restcliente
public static Var obter() throws Exception {
 return new Callable<Var>() {

   private Var praMapa = Var.VAR_NULL;

   public Var call() throws Exception {
    praMapa = cronapi.map.Operations.toMap(Var.valueOf("[{\"id\": \"A2D54D73-1913-41AC-836D-7768CEA91F44\", \"responsavel\": \"João\", \"altura\": \"33\"}, {\"id\": \"1C0767FC-F643-4636-91E1-FF8F0ACF7C29\", \"responsavel\": \"Matheus\", \"altura\": \"52\"}, {\"id\": \"116FC14E-023C-4EB2-8513-05DB1552E2C0\", \"responsavel\": \"Paula\", \"altura\": \"44\"}]"));
    return praMapa;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var atualizafont() throws Exception {
 return new Callable<Var>() {

   private Var retornoGet = Var.VAR_NULL;

   public Var call() throws Exception {
    retornoGet = cronapi.map.Operations.toMap(Var.valueOf("[{\"id\": \"A2D54D73-1913-41AC-836D-7768CEA91F44\", \"responsavel\": \"João\", \"altura\": \"33\"}, {\"id\": \"1C0767FC-F643-4636-91E1-FF8F0ACF7C29\", \"responsavel\": \"Matheus\", \"altura\": \"52\"}, {\"id\": \"116FC14E-023C-4EB2-8513-05DB1552E2C0\", \"responsavel\": \"Paula\", \"altura\": \"44\"}]"));
    System.out.println(retornoGet.getObjectAsString());
    return retornoGet;
   }
 }.call();
}

/**
 *
 * @param id3
 * @return Var
 */
// Descreva esta função...
public static Var deletar(Var id3) throws Exception {
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
// Descreva esta função...
public static Var inserir(Var Nome2) throws Exception {
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
// Descreva esta função...
public static Var update(Var obj) throws Exception {
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

