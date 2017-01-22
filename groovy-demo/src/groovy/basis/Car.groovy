package basis
/**
 * @author: kevin.
 * @date: 2017/1/17.
 * @description:
 */
class Car {

    def miles = 0
    final year
    Car(theYear){
        year = theYear
    }


     static void main(def args){

        Car car = new Car(2017)
         println "Year :$car.year"
         println "Miles :$car.miles"
         println "Setting miles"
         car.miles = 25
         println "Miles:$car.miles"



    }









}
