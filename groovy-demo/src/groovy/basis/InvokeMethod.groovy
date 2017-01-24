package basis

/**
 * @author: kevin.
 * @date: 2017/1/23.
 * @description:
 */
class InvokeMethod {

    static void main(def args){
        def peter = new Person()
        peter.invokeMethod("walk",null)
        peter.invokeMethod("walk",10)
        peter.invokeMethod("walk",[2,'uphill'] as Object[])
    }

    static class Person{
        def walk(){
            println "Walking..."
        }
        def walk(int miles){
            println "Walking ${miles} ..."
        }

        def walk(int miles,String where){
            println "Walking ${miles} miles to ${where}"
        }

    }

}
