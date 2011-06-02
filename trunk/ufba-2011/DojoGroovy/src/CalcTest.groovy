class CalcTest extends GroovyTestCase {
	void testSoma() {
		assert 3 == new Calc().sum(1,2)	
	}
}