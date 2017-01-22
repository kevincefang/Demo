package basis
/**
 * @author: kevin.
 * @date: 2017/1/20.
 * @description:
 */
class Man {

    void helpMoveThings(){
        println "Man's helping..."
    }
}

class Woman{

    void helpMoveThings(){
        println "Woman's helping..."
    }
}

class Elephant{

    void helpMoveThings(){
        println "Elephant's helping..."
    }

    void eatSugarcane(){
        println "I love sugarcanes..."
    }

}




class TakeHelp{

    def takeHelp(helper){
        helper.helpMoveThings()
    }

    static void main(def args){
        TakeHelp takeHelp = new TakeHelp()
        takeHelp.takeHelp(new Man())
        takeHelp.takeHelp(new Woman())
        takeHelp.takeHelp(new Elephant())
    }
}
