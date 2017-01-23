package basis.thread

/**
 * @author: kevin.
 * @date: 2017/1/23.
 * @description:
 */
class Sleep {

    def thread = Thread.start {
        println "Thread started..."
        def startTime = System.nanoTime()
        new Object().sleep(2000)
        def endTime = System.nanoTime()
        println "Thread done in ${(endTime - startTime)/10**9} seconds"



    }

    static void main(def args){
        Sleep sleep = new Sleep()
        new Object().sleep(1000)
        println "Let's interrupt that thread"
        sleep.thread.interrupt()
        sleep.thread.join()

    }

}
