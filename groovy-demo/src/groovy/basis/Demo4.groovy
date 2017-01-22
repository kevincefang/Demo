package basis
/**
 * @author: kevin.
 * @date: 2017/1/17.
 * @description:
 */
class Demo4 {

     static void main(def args){
         Demo4 obj = new Demo4()

         BufferedReader reader = new File("E:\\temp\\datasource.properties").newReader("UTF-8")
         BufferedWriter writer = new File("E:\\temp\\datasource1.properties").newWriter("UTF-8")
         reader.eachLine{line ->
             if(line){
                 writer.writeLine(line)
             }
         }
         writer.close()

         obj.copyFile("E:\\temp\\datasource.properties","E:\\temp\\datasource2.properties",false)

    }

    def createFile(path,createIfNotExist){
        def file = new File(path)
        if(!file.exists()){
            if(createIfNotExist){
                if(!file.getParentFile().exists()){
                    file.getParentFile().mkdirs()
                }
                file.createNewFile()
            }else{
                throw NullPointerException("Missing file:"+path)
            }
        }
        return file
    }

    def copyFile(String fromPath,String toPath,boolean createDestIfNotExist){
        def fromfile = new File(fromPath)
        if(!fromfile.exists()){
            println("Missing file:"+fromfile)
            return false
        }else{
            println("Copying file:"+fromfile)
        }
        def tofile = createFile(toPath,createDestIfNotExist)
        tofile.withWriter {file ->
            fromfile.eachLine{line ->
                file.writeLine(line)
            }
        }
        return true
    }








}
