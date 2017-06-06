<?php

require_once dirname(__FILE__) . '/../F1.php';


class F1Test extends PHPUnit_Framework_TestCase {
    protected $object;
    protected function setUp() {
        $this->object = new F1;
    }
    public function testRecuperarUrl(){
        $json=$this->object->recuperarUrl("http://ergast.com/api/f1/seasons.json");
        $this->assertNotEquals("", $json);
    }
    
    public function testJsonDecode(){
        $json = $this->object->recuperarJson("http://ergast.com/api/f1/seasons.json");
        $mrdata = $json->MRData;
        $this->assertNotEquals("",$mrdata);
        //$this->object->jSonDecode($json);
    }
    
    
    public function testRecuperarSeasons(){
        $seasons=$this->object->recuperarSeasons();
        $this->assertEquals('1950',$seasons[0]->season);
    }
    public function testRecuperarCorridas(){
        $corridas=$this->object->recuperarCorridas('1950');
        $this->assertEquals('1950',$corridas[0]->season);
    }
    protected function tearDown() {
        
    }

}

?>
