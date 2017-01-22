package closure

/**
 * @author: kevin.
 * @date: 2017/1/20.
 * @description:
 */
class Simulate {


    static void main(def args){
        def eq1 = new Equipment({println "Calculator 1"})
        def aCalculator = {println "Calculator 2"}
        def eq2 = new Equipment(aCalculator)
        def eq3 = new Equipment(aCalculator)
        eq1.simulate()
        eq2.simulate()
        eq3.simulate()
    }


}
class Equipment{
    def calculator
    Equipment(calc){
        calculator = calc
    }
    def simulate(){
        println "Running simulate..."
        calculator()
    }
}
