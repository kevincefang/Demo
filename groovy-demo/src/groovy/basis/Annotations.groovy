package basis

import groovy.transform.Canonical

/**
 * @author: kevin.
 * @date: 2017/1/19.
 * @description:
 */
class Annotations {

    @Canonical(excludes = "age")
    static class Person{
        String firstName
        String lastName
        int age

    }

    static class Worker{
        def work(){
            println "get work done..."
        }
        def analyze(){
            println "get report written..."
        }
    }

    static class Expert{
        def analyze(){
            println "expert analysis..."
        }
    }

    static class Manager{

        @Delegate Worker worker = new Worker()
        @Delegate Expert expert = new Expert()
    }





    static void main(String[] args){
        def aa = new Person(firstName: "Sara",lastName: "Walker",age: 25)
        println aa

        def bernie = new Manager()
        bernie.analyze()
        bernie.work()
    }





}


