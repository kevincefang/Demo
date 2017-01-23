package basis
/**
 * @author: kevin.
 * @date: 2017/1/17.
 * @description:
 */
class Demo7 {

     static void main(def args){
         Demo7 obj = new Demo7()

         def str1 = "hello11"
         def str2 = str1
         def str3 = new String("hello")
         def str4 = "hello"

         println "str1 == str2 : ${str1 == str2}"
         println "str1 == str3 : ${str1 == str3}"
         println "str1 == str4 : ${str1 == str4}"

         println "str1.is(str2) : ${str1.is(str2)}"
         println "str1.is(str3) : ${str1.is(str3)}"
         println "str1.is(str4) : ${str1.is(str4)}"

    }














}
