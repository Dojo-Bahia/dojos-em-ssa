class BeerKeeper

  def initialize
     @bars = []
     @amount_by_type = Hash.new 0
     @amount_by_bar = Hash.new 0
		 @total_investment = 0
		 @time_control = Hash.new 0
  end

  def enter_bar(bar)
		 @entered = Time.now
     @bar = bar
     @bars.push @bar
  end

  def current_bar
     @bar
  end

  def drink type, value = 0
    @type =  type
    @amount_by_type[type] += 1
		@amount_by_bar[current_bar] += 1 if current_bar 
		@total_investment += value
  end 

  def current_drink
    @type
  end

  def exit
    raise "You are not in the bar, go!" if @bar.nil?
		@time_control[current_bar] += (Time.now.to_i - @entered.to_i) / 3600
    @bar = nil
  end	

  def visited_bars
    @bars
  end

  def amount_drunk
    @amount_by_type.values.inject(0){ |v,i| v+=i }
  end

  def amount_drunk_by_type(type)
    @amount_by_type[type]
  end

  def amount_drunk_by_bar(bar)
		 @amount_by_bar[bar]
  end

	def total_investment
		@total_investment
	end

	def time_spent_in_bar(bar)
		@time_control[bar]
	end
	
	def drunk_speed
    amount_drunk / ((Time.now.to_i - @entered.to_i) / 3600.0)
	end
	
end
