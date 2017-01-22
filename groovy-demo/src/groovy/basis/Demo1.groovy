package basis
/**
 * @author: kevin.
 * @date: 2017/1/17.
 * @description:
 */
class Demo1 {

     static void main(def args){
        println("Hello World");
        def myRange = 25 .. 10
        println(myRange)

        println("First element of collection is :"+ myRange[0])
        println("Last element of collection is : "+ myRange[-1])
        println("Sub collection :"+ myRange[2,5])
        println("Reverse :"+ myRange.reverse())
        println("Remove element :"+ (myRange-18))
        println("Remove sub collection:"+(myRange -[12,13,14,15]))
        println("//-----------------------------------------------------")

        def coll = ["C","C++","Java","JavaScript","Python"]
        println("Program languages you're knowing:"+ coll)
        println("Last element is:"+coll[-1])

        coll = coll*.toUpperCase()
        println(coll)

         println("//-----------------------------------------------------")
         String.metaClass.isEqual = {->
             delegate == delegate.reverse()
         }
         def word = "tattarrattat"
         println "$word is a palindrom ? ${word.isEqual()}"
         word = "Hello World"
         println "$word is a palindrome ? ${word.isEqual()}"

         println("//-----------------------------------------------------")
         def list = ['aaa','bbb','ccc']
        println(list.join('$'))
         println(list.getClass())

         Integer.metaClass.percentRaise = {amount ->
             amount * (1 + delegate /100.0)
         }
         println(5.percentRaise(100))

         println(XmlParser.class)
         println(XmlParser.class.superclass)

         for( i in 0..2){
             print "ho"
         }
     }



}
