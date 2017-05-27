class Cbsoft {
    def static main(args) {
        new Cbsoft().dojo("Cbsoft").each { println it}
        println "HAVE FUN!!!!!\n\nhttp://groups.google.com/group/dojo-bahia\n"
    }  
    def dojo(name) {
        ["Coding-Dojo $name", "-" * 30, "10' Dojo", "5'  Problema", 
         "75' PairProgramming", "20' Retrospectiva"]
    }
}
