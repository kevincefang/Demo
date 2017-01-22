package basis
/**
 * @author: kevin.
 * @date: 2017/1/17.
 * @description:
 */
class Demo3 {

     static void main(def args){
         Demo3 obj = new Demo3()

         def mydata = ["java",'groovy','javascript']

         for(i in 0..2){
             obj.printUppercase(mydata[i])
         }

         println("use closure ===================")
         mydata.each {
             println(it.toUpperCase())
         }

         println("def closure============")
         def myclosure = {myvar ->
             println(myvar.toUpperCase())
         }
         mydata.each(myclosure)

         println("closure and map============")
         def mymap = ["name":"kevin",age:24,hobbies:["sing","reading","playing"]]
         mymap.each {key,value ->
             println("key is :"+key + " and value is:"+value)
         }

         println("closure and string===============")
         def mystring = "kevin"
         mystring.each {s ->
             print(s+",")
         }

    }



    def printUppercase(a){
        println(a.toUpperCase())
    }





}
