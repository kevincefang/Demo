package basis
/**
 * @author: kevin.
 * @date: 2017/1/17.
 * @description:
 */
class Demo6 {

     static void main(def args){
         Demo6 obj = new Demo6()

         def (firstName,lastName) = obj.splitName("James Bond")
         println "$lastName,$firstName"

         println "------------------------------------------------1"

         def name1 = "Thomson"
         def name2 = "kevin"

         println "$name1 and $name2"
         (name1,name2) = [name2,name1]
         println "$name1 and $name2"

         println "------------------------------------------------2"
         for(ch in 'a'..'c'){
             println "ch"
         }

         println "------------------------------------------------2"
         def lst = ['hello']
         lst << 'there'
         println lst
    }

    def splitName(fullName){
        fullName.split(" ")
    }












}
