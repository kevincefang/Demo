package basis.thread

/**
 * @author: kevin.
 * @date: 2017/1/23.
 * @description:
 */
class ThreadStart {

    def printThreadInfo(msg){
        def currentThread = Thread.currentThread()
        println "${msg} Thread is ${currentThread}.Daemon? ${currentThread.isDaemon()}"

    }


    static void main(args){
        ThreadStart obj = new ThreadStart()
        obj.printThreadInfo("Main")

        Thread.start {
            obj.printThreadInfo("Thread started")
            def startTime = System.currentTimeMillis()
            sleep(3000){
                println "Thread interrupted..."
            }
            def endTime = System.currentTimeMillis()
            println "times : ${endTime- startTime}"
            println "Finished started thread..."
        }
        sleep(1000)

        Thread.startDaemon {
            obj.printThreadInfo("started Daemon")
            sleep(3000){
                println "daemonThread Interrupted"
            }
            println "Finished Started Daemon"
        }
    }
}
