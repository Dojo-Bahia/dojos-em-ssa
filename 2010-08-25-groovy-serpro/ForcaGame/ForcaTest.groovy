import groovy.util.GroovyTestCase

class ForcaTestTest extends GroovyTestCase {
    void testGetForca0() {
	def forca = new Forca("forca.txt")
	def f = forca.getForca(0)
	assertEquals("\n\n\n\n\n\n-----------\n", f)
    }

    void testGetForca1() {
	def forca = new Forca("forca.txt")
	def f = forca.getForca(1)
	assertEquals("\n  |\n  |\n  |\n  |\n  |\n-----------\n", f)
    }

    void testGetForca3() {
	def forca = new Forca("forca.txt")
	def f = forca.getForca(2)
	assertEquals("  +-----+\n  |\n  |\n  |\n  |\n  |\n-----------\n", f)
    }

    void testGetForca4() {
	def forca = new Forca("forca.txt")
	def f = forca.getForca(3)
	assertEquals("  +-----+\n  |     |\n  |\n  |\n  |\n  |\n-----------\n", f)
    }

    void testGetForca5() {
	def forca = new Forca("forca.txt")
	def f = forca.getForca(4)
	assertEquals("  +-----+\n  |     |\n  |     O\n  |\n  |\n  |\n-----------\n", f)
    }

	/* completar */
}
