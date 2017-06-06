require 'tesouro'

describe "Divisao de Tesouros" do
  
	it "deveria dar 1 pedra para 1 pirata quando tem 1 pirata e uma pedra" do
	  Tesouro.new([1]).dividido_em(1).should == [1]
	end
	
	it "o tesouro [1,1] para um pirata fica [1,1]" do
	  Tesouro.new([1,1]).dividido_em(1).should == [1,1]
	end

	it "o tesouro [1,1] para dois piratas fica [1],[1]" do
		Tesouro.new([1,1]).dividido_em(2).should == [[1],[1]]
	end
	
	it "o tesouro [2,2] para dois piratas fica [2],[2]" do
		Tesouro.new([2,2]).dividido_em(2).should == [[2],[2]]	  
	end
	
	it "o tesouro [2,2,2] para tres piratas fica [2],[2],[2]" do
		Tesouro.new([2,2,2]).dividido_em(3).should == [[2],[2],[2]]	  	  
	end
	
	it "o tesouro [1,1] para tres piratas retorna ERRO" do
	  Tesouro.new([1,1]).dividido_em(3).should == "ERRO"
	end
	it "o tesouro [1,2] para dois piratas retorna ERRO" do
	  Tesuro.new([1,2]).dividido_em(2).should == "ERRO"
	end
	
end