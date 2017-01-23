package basis.thread

/**
 * @author: kevin.
 * @date: 2017/1/23.
 * @description:
 */
class Sleep2 {


    def playWithSleep(flag){
        def thread = Thread.start {
            println "Thread started..."
            def startTime = System.nanoTime()
            new Object().sleep(2000){
                println "Interrupted...${it}"
                flag
            }
            def endTime = System.nanoTime()
            println "Thread done in ${(endTime-startTime)/10**9} seconds"
        }
        thread.interrupt()
        thread.join()


    }

    static void main(def args){
        Sleep2 sleep = new Sleep2()
        sleep.playWithSleep(true)
        sleep.playWithSleep(false)

    }

}
