package com.groovy.test

import org.junit.Test

/**
 *
 * @author zhongping
 * @date 2017/4/27
 */
class GroovyTest2 {



    @Test
    void test14(){
        def name = 'Groovy'
        def template = """
    Dear Mr ${name},

    You're the winner of the lottery!

    Yours sincerly,

    Dave
   """

        assert template.toString().contains('Groovy')
    }

    @Test
    void test13(){
        def key = "a"
        def m = ["${key}": "letter ${key}"]

        assert m["a"] == null
        GString k="${key}"

        println m."${key}"

        println m.k

        println m

    }



    String takeString(String message) {
        println "string"
         message
    }

//    String takeString(GString message) {
//        println "Gstring"
//         message
//    }

    @Test
    void test12(){
        def repl="ffff"

        def message=/${repl}/

        println message


    }

    @Test
    void test11(){


        def message = "The message is ${'hello'}"
        assert message instanceof GString

        def result = takeString(message)
        assert result instanceof String
        assert result == 'The message is hello'


    }


    @Test
    void test10(){
        def sParameterLessClosure = "1 + 2 == ${-> 3}"
        assert sParameterLessClosure == '1 + 2 == 3'

        def sOneParamClosure = "1 + 2 == ${ w -> w << 3}"
        assert sOneParamClosure == '1 + 2 == 3'

    }




    @Test
    void test9() {
        def strippedFirstNewline = '''
                                    line one
                                    line two
                                    line three'''

        println strippedFirstNewline

        def fileName = 'anglina'



        def str='yes this is ${fileName}'//yes this is ${fileName}

        println str

        def str1="yes this is ${fileName}"//yes this is anglina

        println str1

        def str3='''yes this is
                    ${fileName}
                     '''//yes this is ${fileName}

        println str3


        assert '${name}' == "\${name}"

        def repl="ffff"

        def message=/${repl}/

        println message //fff

    }
    @Test
    void test8() {
        def shareData = new Binding()
        shareData.setProperty("b", "a")

        def map = [:]
        map."a" = "b"

        println   map.(shareData.getProperty("b"))

        def b=/slashy string/
        println b

    }

    @Test
    void test7() {
        def sharedData = new Binding()
        def shell = new GroovyShell(sharedData)

        shell.evaluate('int foo=123')


        try {
            assert sharedData.getProperty('foo')
        } catch (MissingPropertyException e) {
            println "foo is defined as a local variable"
        }

    }


    @Test
    void test6() {
        def shareData = new Binding()
        def shell =new GroovyShell(shareData)

        shareData.setProperty('currentData', new Date())
        println shell.evaluate('"this time is $currentData"')

        shell.evaluate('int foo=123')

       println  shareData.getProperty('foo')


    }



    @Test
    void test5() {
        Script script =new GroovyShell().parse  "3*4"
        println script.run()



    }

    @Test
    void test4() {
        def shell = new GroovyShell()
        def script=shell.parse "3*4"

        println script.run()



    }


    @Test
     void test3() {

        def scriptResult = new GroovyShell()
        println scriptResult.evaluate("mkdir")


    }



    @Test
    void test1(){
     println(method(123))
    }

    @Test
    void test2(){
        assert Eval.me('"foo".toUpperCase()') == 'FOO'

        println( Eval.me('"foo".toUpperCase()'))
        println "abc".toLowerCase()

    }

    int method(int a){ 1 }

    int method(Object b){2}
}
