package basis
/**
 * @author: kevin.
 * @date: 2017/1/17.
 * @description:
 */
class Demo2 {

     static void main(def args){
         Demo2 obj = new Demo2();
         obj.forFunc1(1)
         println("--------------")
         obj.forFunc2(2)

         def mymap = ["name":"kevin",age:24,hobbies:["reading","playing","Bike"]]
         println("Your name is " +mymap["name"]+",age is "+ mymap["age"]+",hobbies:"+mymap["hobbies"])
         mymap.location = "ShangHai"
         println(mymap)

         mymap.each {key,value ->
             println("key:"+key+",value:"+value)
         }
    }

    def forFunc1(a,repeat=10){
        for(def i=a;i<repeat;i++){
            print(i+",")
        }
    }

    def forFunc2(a,repeat =10){
        for(i in a .. repeat){
            print(i+",")
        }
    }



}
