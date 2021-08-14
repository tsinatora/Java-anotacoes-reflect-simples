/**
 * 
 * @author Thiago Sinatora
 * 
 * https://www.devmedia.com.br/como-criar-anotacoes-em-java/32461
 * 
 * 
 * Hierarquia de pastas feita errada com ponto, deve-se ter um aninhamento delas, os pontos são colocados
 * após o package no código fonte e não no nome da pasta.
 * 
 * Exemplo correto de packge, br\com\thiago\pacote\src\main
 * 
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class PrincipalDevMedia1{
    public static void main(String[] args) {
        //Cliente cliente = new Cliente();
        //System.out.println(cliente.getClass().getName()); Pega nome instanciando
        //System.out.println(Cliente.class.getName());  // Pega nome sem instanciar
    

        /*  Class<Cliente> clazz = (Class<Cliente>) cliente.getClass();        

        // Lista os atributos
       for(Field f : clazz.getDeclaredFields()){
              System.out.println(f.getName());
       } 

       // Lista métodos
       for(Method m : clazz.getDeclaredMethods()){
           System.out.println(m.getName());
        */


        /* Chama metodo createNewInstance
        Cliente clienteThiago = (Cliente) createNewInstance(Cliente.class);  

        if (clienteThiago == null){
            System.err.println("Ops, não foi possível criar o objeto cliente");
        } else {
            System.out.println("Criou o objeto");
        } */


        /* Usa um cliente para usar o mostraValores;

        Cliente cliente1 = new Cliente();
        cliente1.setCodigo(1010);
        cliente1.setDataNascimento(new Date());
        cliente1.setEnderecoCompleto("Rua Alves de Almeida");
        cliente1.setNome("Thiago Sinatora");
        cliente1.setNomeMae("Anita Sinatora");
        cliente1.setNomePai("Pedro Sinatora");

        mostraValores(cliente1);
        */
    }     


    /*
        Executa print nos métodos anotados
    */
    private static void mostraValores(Object obj){
        try {
            Class clazz = obj.getClass();
            for(Method m : clazz.getDeclaredMethods()){
                if(m.isAnnotationPresent(Mostrar.class)){
                    if(m.getParameterTypes().length > 0){
                        System.err.println(" " + m.getName() + " anotado com @Mostrar de forma errada, ignorando ...");
                        continue;
                    }
                    System.out.println(m.getName() + ": " + m.invoke(obj));
                }
            }
        } catch (IllegalAccessException | IllegalArgumentException
                                        | InvocationTargetException e){
            e.printStackTrace();
        }     
        
    }
    
    /*
        Método para treinar reflection

        Instancia qualquer classe recebida, sem saber qual é ou o que tem nela
    */
    private static Object createNewInstance(Class clazz) {
        Constructor<?> ctor;
        try {
               ctor = clazz.getConstructors()[0];
               Object object = ctor.newInstance();
               return object;
        } catch (SecurityException
                      | InstantiationException | IllegalAccessException
                      | IllegalArgumentException | InvocationTargetException e) {
               
               e.printStackTrace();
        }
   
        return null;
   }
}