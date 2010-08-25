/*
testAcertouLetraEmUmaPosicao
testAcertouLetraEmMaisDeUmaPosicao
testErrouLetra
testMorreu
testGanhou
testAcertouLetra1aPosicao
testAcertouLetraUltimaPosicao
testAcertouLetraPeloMeio
testLetraRepetida
*/
import groovy.util.GroovyTestCase
class JogoForcaTest extends GroovyTestCase {
 def forca
    void setUp(){
         forca = new JogoForca("GROOVY")
    }

    void testErrouLetra() {
        
        assertTrue 0 == forca.palpite('X')       
    }

    void testAcertouLetraEmUmaPosicao() {
        
        assertTrue forca.palpite('V')==1                    
    }

    void testAcertouLetraEmMaisDeUmaPosicao() {
       
        assertTrue  forca.palpite("O") > 1

    }

    void testAcertouLetra1aPosicao(){
        forca.palpite "G"
        assertEquals "G_____",  forca.getPalavraRevelada()
    }


    void testAcertouLetraPeloMeio(){
        forca.palpite "O"
        assertEquals "__OO__",  forca.getPalavraRevelada()
    }



    void testGanhou(){
       
        ["G","O","R","V","X","Y"].each {
            forca.palpite it        
        }
assertEquals forca.palavra,  forca.getPalavraRevelada()
    }



    void testMorreu(){
       
        10.times  {
            forca.palpite "x"        
        }
assertNotEquals  forca.palavra,  forca.getPalavraRevelada()
    }
}


