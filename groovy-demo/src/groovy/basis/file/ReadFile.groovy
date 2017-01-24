package basis.file

/**
 * @author: kevin.
 * @date: 2017/1/24.
 * @description:
 */
class ReadFile {

    static void main(args){

        //println new File("E:\\temp\\datasource.properties").text

        new File("E:\\temp\\datasource.properties").eachLine {line ->
           // println "this line is : ${line}"
        }
        new File("E:\\temp\\datasource.properties").withWriter {file ->
            file << "some data..."

        }
    }

}
