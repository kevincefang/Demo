package closure;

/**
 * @author: kevin.
 * @date: 2017/1/22.
 * @description:
 */
public class ReadWriteFile {

    static void main(def args){

        new File("E:\\个人文件\\面试.txt").eachLine {line ->
            //println line
        }

        new File("E:\\个人文件\\面试.txt").eachLine{line,nb ->
           // println "line ${nb}:${line}"
        }


        def list = new File("E:\\个人文件\\面试.txt").collect{it}
        //println list

        def arr =new File("E:\\个人文件\\面试.txt") as  String[]
        //println arr

        byte[] bytes = new File("E:\\个人文件\\面试.txt").bytes
        //println bytes


    }
}
