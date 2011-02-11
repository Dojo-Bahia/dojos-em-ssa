require 'test/unit'
require 'beer_keeper'
require 'mocha'

class BeerKeeperTest < Test::Unit::TestCase

  attr_reader :bk

  def setup
    @bk = BeerKeeper.new
  end

  def test_new_instance
    assert_kind_of BeerKeeper, BeerKeeper.new
  end

  def test_enter_bar
    bk.enter_bar('Chuleta')
    assert_equal 'Chuleta', bk.current_bar
  end

  def test_drinks
    bk.drink 'Lata'
    assert_equal 'Lata', bk.current_drink
  end

  def test_exit
    bk.enter_bar('Chuleta')	
    bk.exit
    assert_nil bk.current_bar 
  end	

  def test_exit_without_enter
    assert_raise RuntimeError do	    
      bk.exit
    end
  end

  def test_visited_bars
    bk.enter_bar('Chuleta')
    bk.enter_bar('Mercado do Peixe')
    assert_equal ['Chuleta', 'Mercado do Peixe'], bk.visited_bars
  end
  
  def test_amount_drunk
    bk.drink('Lata')
    bk.drink('Lata')  
    assert_equal 2, bk.amount_drunk
  end

  def test_amount_drunk_by_type
    bk.drink('Lata')
    assert_equal 1, bk.amount_drunk_by_type('Lata')
    bk.drink('Devassa')
    bk.drink('Devassa')
    assert_equal 2, bk.amount_drunk_by_type('Devassa')
  end

  def test_amount_drunk_by_bar
    bk.enter_bar('Chuleta')
    bk.drink('Lata')
    bk.drink('Devassa')
    assert_equal 2, bk.amount_drunk_by_bar('Chuleta')
  end

  def test_amount_drunk_by_bars
		bk.enter_bar('Chuleta')
    bk.drink('Lata')
    bk.drink('Devassa')
		bk.enter_bar('Mercado do Peixe')
    bk.drink('Lata')
    bk.drink('Devassa')
		bk.drink('Garrafa')
    assert_equal 2, bk.amount_drunk_by_bar('Chuleta')
	  assert_equal 3, bk.amount_drunk_by_bar('Mercado do Peixe')
	end
	def test_total_investment
    bk.drink('Lata', 1)
		bk.drink('Lata', 1.50)

		assert_equal 2.50, bk.total_investment
	end	

	def test_total_time_spent
    now = Time.now
    Time.stubs(:now).returns(now)
		bk.enter_bar('Chuleta')
    Time.stubs(:now).returns(now + 3600 * 3)
		bk.exit
		assert_equal 3, bk.time_spent_in_bar('Chuleta')
	end

  def test_drunk_speed
    now = Time.now
    Time.stubs(:now).returns(now)
		bk.enter_bar('Chuleta')
		bk.drink('Lata')
		bk.drink('Lata')
    Time.stubs(:now).returns(now + 3600 * 4)
		assert_equal 0.5, bk.drunk_speed
  end
  
end
