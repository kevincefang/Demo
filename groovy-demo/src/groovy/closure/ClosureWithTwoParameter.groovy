package closure

/**
 * @author: kevin.
 * @date: 2017/1/20.
 * @description:
 */
class ClosureWithTwoParameter {

    static tellFortune(closure){
        closure new Date(),"Your day is filled with ceremony"
    }

    static void main(def args){
          ClosureWithTwoParameter.tellFortune({data,fortune ->
              println "Fortune for ${data} is ${fortune}"
          })

    }
}
