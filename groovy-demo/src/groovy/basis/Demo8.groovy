package basis
/**
 * @author: kevin.
 * @date: 2017/1/17.
 * @description:
 */
class Demo8 {

     static void main(def args){
         Demo8 obj = new Demo8()

         def str = "hello"
         println str
         println str.dump()
         println str.inspect()

         def lst = [1,2]
         lst.with {
             add(3)
             add(4)
             println size()
             println lst
         }

    }














}
